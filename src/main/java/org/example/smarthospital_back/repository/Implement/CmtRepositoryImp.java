package org.example.smarthospital_back.repository.Implement;

import org.example.smarthospital_back.entity.CmtEntity;
import org.example.smarthospital_back.mapper.CmtMapper;
import org.example.smarthospital_back.repository.CmtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CmtRepositoryImp implements CmtRepository {
    @Autowired
    CmtMapper cmtMapper;

    @Override
    public int insertComment(long d_id, long u_id, int cmt_rank, String cmt_content) {
        return cmtMapper.insertComment(d_id, u_id, cmt_rank, cmt_content);
    }

    @Override
    public List<CmtEntity> checkCmtByUid(long u_id) {
        return cmtMapper.checkCmtByUid(u_id);
    }

    @Override
    public List<CmtEntity> checkCmtByDid(long d_id) {
        return cmtMapper.checkCmtByDid(d_id);
    }
}

