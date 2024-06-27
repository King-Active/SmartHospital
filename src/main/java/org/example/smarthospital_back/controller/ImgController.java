package org.example.smarthospital_back.controller;

import org.example.smarthospital_back.repository.FeeRepository;
import org.example.smarthospital_back.repository.MapRepository;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@ResponseBody
@CrossOrigin
@RequestMapping("/Map")
public class ImgController {
    MapRepository mr;

    @PostMapping("/sendMap")
    @ResponseBody
    public int upload(String m_name, MultipartFile file) {
        //图片校验（图片是否为空,图片大小，上传的是不是图片、图片类型（例如只能上传png）等等）
        if (file.isEmpty()) {
            return -1;
        }
        //可以自己加一点校验 例如上传的是不是图片或者上传的文件是不是png格式等等 这里省略
        //获取原来的文件名和后缀
        String originalFilename = file.getOriginalFilename();
        String ext = "."+ originalFilename.split("\\.")[1];
        //生成一个新的文件名（以防有重复的名字存在导致被覆盖）
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String newName = uuid + ext;
        //拼接图片上传的路径 url+图片名
        ApplicationHome applicationHome = new ApplicationHome(this.getClass());
        String pre = applicationHome.getDir().getParentFile().getParentFile().getAbsolutePath() + "\\src\\main\\resources\\static\\images\\";
        String path = pre + newName;
        try {
            file.transferTo(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int result = mr.insertMap(m_name, path);
        return result;
    }

    @PostMapping("/getMap")
    @ResponseBody
    public String download(long m_id){
        String result = mr.getMap(m_id);
        return result;
    }
}


