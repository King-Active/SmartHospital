package org.example.smarthospital_back.repository;

import org.example.smarthospital_back.entity.CmtEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CmtRepository {
    int insertComment(long d_id, long u_id, int cmt_rank, String cmt_content);
    List<CmtEntity> checkCmtByUid(long u_id);
    List<CmtEntity> checkCmtByDid(long d_id);
}

