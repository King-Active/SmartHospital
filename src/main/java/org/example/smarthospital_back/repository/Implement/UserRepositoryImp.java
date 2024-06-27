package org.example.smarthospital_back.repository.Implement;

import org.example.smarthospital_back.entity.UserEntity;
import org.example.smarthospital_back.mapper.UserMapper;
import org.example.smarthospital_back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImp implements UserRepository {
    @Autowired
    UserMapper usermapper;
    @Override
    public UserEntity checkUserExists(String u_tel) {
        return usermapper.checkUserExists(u_tel);
    }
    @Override
    public UserEntity doLogin(String u_tel, String u_pwd) {
        return usermapper.doLogin(u_tel,u_pwd);
    }
    @Override
    public int doRegister(String u_tel, String u_pwd) {
        return usermapper.doRegister(u_tel,u_pwd);
    }
}
