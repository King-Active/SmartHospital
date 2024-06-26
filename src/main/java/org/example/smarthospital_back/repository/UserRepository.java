package org.example.smarthospital_back.repository;

import org.example.smarthospital_back.entity.UserEntity;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository {

    UserEntity doLogin(int u_id, String u_pwd);
}
