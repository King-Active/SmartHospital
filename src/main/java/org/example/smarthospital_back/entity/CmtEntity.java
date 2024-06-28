package org.example.smarthospital_back.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class CmtEntity {
    @JsonProperty
    private long cmt_id;

    @JsonProperty
    private long d_id;

    @JsonProperty
    private long u_id;

    @JsonProperty
    private int cmt_rank;

    @JsonProperty
    private String cmt_content;
}
