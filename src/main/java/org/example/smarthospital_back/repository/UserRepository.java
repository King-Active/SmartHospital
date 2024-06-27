package org.example.smarthospital_back.repository;

import org.example.smarthospital_back.entity.UserEntity;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository {

    UserEntity doLogin(String u_tel, String u_pwd);
    int doRegister(String u_tel, String u_pwd);
}
