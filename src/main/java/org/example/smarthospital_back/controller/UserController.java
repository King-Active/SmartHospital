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
    public String doLogin(String u_tel,String u_pwd){
        System.out.println("log");
        System.out.println(u_tel);
        System.out.println(u_pwd);
        if("".equals(u_tel) || "".equals(u_pwd)){
            return "格式错误";
        }
        UserEntity ue = ur.doLogin(u_tel,u_pwd);
        if(ue == null) {
            return "账号或密码错误";
        } else {
            return "登录成功";
        }
    }

    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    @ResponseBody
    public String doRegister(String u_tel,String u_pwd){
        System.out.println("reg");
        System.out.println(u_tel);
        System.out.println(u_pwd);
        if("".equals(u_tel) || "".equals(u_pwd)){
            return "格式错误";
        }
        UserEntity ue = ur.checkUserExists(u_tel);
        if(ue == null) {
            int regResult = ur.doRegister(u_tel,u_pwd);
            return "注册成功";
        }
        else{
            return "该用户已存在";
        }
    }

    @RequestMapping(value = "/doTest", method = RequestMethod.GET)
    @ResponseBody
    public String doTest(){
        System.out.println("test success");
        return "登录成功";
    }
}
