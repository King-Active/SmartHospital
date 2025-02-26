package org.example.smarthospital_back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.smarthospital_back.entity.UserEntity;

@Mapper
public interface UserMapper{
    UserEntity checkUserExists(@Param("u_tel") String u_tel);
    UserEntity doLogin(@Param("u_tel") String u_tel, @Param("u_pwd") String u_pwd);
    int doRegister(@Param("u_tel") String u_tel, @Param("u_pwd") String u_pwd);
}
