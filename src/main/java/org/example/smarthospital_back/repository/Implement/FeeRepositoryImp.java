package org.example.smarthospital_back.repository.Implement;

import org.example.smarthospital_back.entity.FeeEntity;
import org.example.smarthospital_back.entity.FeeEntity;
import org.example.smarthospital_back.mapper.FeeMapper;
import org.example.smarthospital_back.repository.FeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class FeeRepositoryImp implements FeeRepository {
    @Autowired
    FeeMapper feemapper;
    @Override
    public int generateFee(String fee_type,
                    long u_id,
                    double fee_money,
                    Timestamp fee_time
    ){
        return feemapper.generateFee(fee_type,u_id,fee_money,fee_time);
    }
    @Override
    public int payFee(long fee_id){
        return feemapper.payFee(fee_id);
    };
    @Override
    public List<FeeEntity> checkFee(long fee_id){
        return feemapper.checkFee(fee_id);
    };
}
