package org.example.smarthospital_back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.smarthospital_back.entity.CmtEntity;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface CmtMapper{
    int insertComment(@Param("d_id") long d_id,
                      @Param("u_id") long u_id,
                      @Param("cmt_rank") int cmt_rank,
                      @Param("cmt_content") String cmt_content);
    List<CmtEntity> checkCmtByUid(@Param("u_id") long u_id);
    List<CmtEntity> checkCmtByDid(@Param("d_id") long d_id);
}
