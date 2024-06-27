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
    public int doLogin(String u_tel,String u_pwd){
        System.out.println("log");
        System.out.println(u_tel);
        System.out.println(u_pwd);
        if("".equals(u_tel) || "".equals(u_pwd)){
            System.out.println("0");
            return 0;
        }
        UserEntity ue = ur.doLogin(u_tel,u_pwd);
        if(ue == null) {
            System.out.println("1");
            return 1;
        } else {
            System.out.println("2");
            return 2;
        }
    }

    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    @ResponseBody
    public int doRegister(String u_tel,String u_pwd){
        System.out.println("reg");
        System.out.println(u_tel);
        System.out.println(u_pwd);
        if("".equals(u_tel) || "".equals(u_pwd)){
            return 0;
        }
        int regResult = ur.doRegister(u_tel,u_pwd);
        return 1;
    }

    @RequestMapping(value = "/doTest", method = RequestMethod.GET)
    @ResponseBody
    public String doTest(){
        System.out.println("oiashfoiahfoiahioa");
        return "登录成功";
    }
}
