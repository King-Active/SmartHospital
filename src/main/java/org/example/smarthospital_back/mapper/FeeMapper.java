package org.example.smarthospital_back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.smarthospital_back.entity.FeeEntity;
import org.example.smarthospital_back.entity.UserEntity;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface FeeMapper{
    int generateFee(@Param("fee_type") String fee_type,
                    @Param("u_id") long u_id,
                    @Param("fee_money") double fee_money,
                    @Param("fee_time") Timestamp fee_time
    );
    int payFee(@Param("fee_id") long fee_id);
    List<FeeEntity> checkFee(@Param("u_id") long u_id);
}

