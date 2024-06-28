package org.example.smarthospital_back.controller;

import org.example.smarthospital_back.repository.FeeRepository;
import org.example.smarthospital_back.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Value;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@ResponseBody
@CrossOrigin
@RequestMapping("/Map")
public class ImgController {

    @Autowired
    MapRepository mr;
    @Value("${upload.path}")

    private String uploadPath;

    @PostMapping("/sendMap")
    @ResponseBody
    public int upload(String m_name, MultipartFile file) {
        // 图片校验（图片是否为空, 图片大小，上传的是不是图片、图片类型（例如只能上传png）等等）
        if (file.isEmpty()) {
            return -1;
        }

        // 获取原来的文件名和后缀
        String originalFilename = file.getOriginalFilename();
        String ext = "." + originalFilename.split("\\.")[1];

        // 生成一个新的文件名（以防有重复的名字存在导致被覆盖）
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String newName = uuid + ext;

        // 拼接图片上传的路径 url+图片名
        String path = uploadPath + File.separator + newName;

        try {
            // 创建目标文件
            File dest = new File(path);
            // 确保目标文件所在目录存在
            dest.getParentFile().mkdirs();
            // 保存文件
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }

        // 假设 mr 是一个 MapRepository 或类似的数据库访问对象
        int result = mr.insertMap(m_name, path);
        return result;
    }

    @PostMapping("/getMap")
    @ResponseBody
    public String download(long m_id){
        String result = mr.getMap(m_id);
        if(result == null) return "false";
        return result;
    }
}


