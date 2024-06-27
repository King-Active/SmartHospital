package org.example.smarthospital_back.repository;

import org.apache.ibatis.annotations.Param;
import org.example.smarthospital_back.entity.FeeEntity;
import org.example.smarthospital_back.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

public interface FeeRepository {
    int generateFee(String fee_type,
                    long u_id,
                    double fee_money,
                    Timestamp fee_time
    );
    int payFee(long fee_id);
    List<FeeEntity> checkFee(long u_id);
}
