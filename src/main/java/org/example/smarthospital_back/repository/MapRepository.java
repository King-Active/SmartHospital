package org.example.smarthospital_back.repository;

import org.apache.ibatis.annotations.Param;
import org.example.smarthospital_back.entity.UserEntity;
import org.springframework.stereotype.Repository;
@Repository
public interface MapRepository {
    int insertMap(String m_name, String m_pic_url);

    String getMap(long m_id);
}
