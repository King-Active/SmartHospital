package org.example.smarthospital_back.repository.Implement;

import org.example.smarthospital_back.mapper.FeeMapper;
import org.example.smarthospital_back.mapper.MapMapper;
import org.example.smarthospital_back.repository.FeeRepository;
import org.example.smarthospital_back.repository.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MapRepositoryImp implements MapRepository {
    @Autowired
    MapMapper mapmapper;

    @Override
    public int insertMap(String m_name, String m_pic_url){
        return mapmapper.insertMap(m_name, m_pic_url);
    }

    @Override
    public String getMap(long m_id){
        return mapmapper.getMap(m_id);
    }
}
