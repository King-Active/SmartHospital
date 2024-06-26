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
    public String doLogin(long u_id,String u_pwd){
        System.out.println(u_id);
        System.out.println(u_pwd);
        if(u_id == 0 || "".equals(u_pwd)){
            return "格式错误";
        }
        UserEntity ue = ur.doLogin(u_id,u_pwd);
        if(ue == null) {
            return "用户不存在";
        } else {
            return "登录成功";
        }
    }

    @RequestMapping(value = "/doTest", method = RequestMethod.GET)
    @ResponseBody
    public String doTest(){
        System.out.println("oiashfoiahfoiahioa");
        return "登录成功";
    }
}
