package org.example.smarthospital_back.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public String doLogin(String u_id,String u_pwd){
        System.out.println("oiashfoiahfoiahioa");
        return "登录成功";
    }
}
