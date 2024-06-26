package org.example.smarthospital_back.repository;

import org.example.smarthospital_back.entity.UserEntity;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository {

    UserEntity doLogin(long u_id, String u_pwd);
    int doRegister(long u_tel, String u_pwd);
}
