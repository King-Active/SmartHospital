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
    public UserEntity doLogin(long u_id, String u_pwd) {
        return usermapper.doLogin(u_id,u_pwd);
    }
    @Override
    public int doRegister(long u_tel, String u_pwd) {
        return usermapper.doRegister(u_tel,u_pwd);
    }
}
