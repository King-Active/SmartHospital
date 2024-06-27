package org.example.smarthospital_back.controller;
import org.example.smarthospital_back.entity.UserEntity;
import org.example.smarthospital_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserRepository ur;

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public String doLogin(@RequestParam String u_tel, @RequestParam String u_pwd){
        if("".equals(u_tel)|| "".equals(u_pwd)){
            return "格式错误";
        }
        UserEntity ue = ur.doLogin(u_tel,u_pwd);
        if(ue == null) {
            return "用户不存在";
        } else {
            return "登录成功";
        }
    }

    @RequestMapping(value = "/doTest", method = RequestMethod.GET)
    @ResponseBody
    public String doTest(){
        return "登录成功";
    }

//    @RequestMapping(value = "/forgetPassword", method = RequestMethod.POST)
//    @ResponseBody
//    public String forgetPassword(@RequestParam int u_tel, @RequestParam String u_pwd){
//        if(u_tel == 0 || "".equals(u_pwd)){
//            return "格式错误";
//        }
//        UserEntity ue = ur.doLogin(u_tel,u_pwd);
//
//    }
}
