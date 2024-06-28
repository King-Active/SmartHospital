package org.example.smarthospital_back.controller;

import org.example.smarthospital_back.entity.CmtEntity;
import org.example.smarthospital_back.repository.CmtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Comment")
public class CommentController {

    @Autowired
    private CmtRepository cmtRepository;

    @PostMapping("/addComment")
    public int insertComment(@RequestParam("d_id") long d_id,
                             @RequestParam("u_id") long u_id,
                             @RequestParam("cmt_rank") int cmt_rank,
                             @RequestParam("cmt_content") String cmt_content) {
        return cmtRepository.insertComment(d_id, u_id, cmt_rank, cmt_content);
    }

    @PostMapping("/getByUser")
    public List<CmtEntity> checkCmtByUid(long u_id) {
        return cmtRepository.checkCmtByUid(u_id);
    }

    @PostMapping("/getByDoctor")
    public List<CmtEntity> checkCmtByDid(long d_id) {
        return cmtRepository.checkCmtByDid(d_id);
    }
}

