package org.example.smarthospital_back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MapMapper {
    int insertMap(@Param("m_name")String m_name, @Param("m-pic_url")String m_pic_url);

    String getMap(@Param("m_id")long m_id);
}
