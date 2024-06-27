package org.example.smarthospital_back.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

public class FeeEntity {
    @JsonProperty
    private long fee_id;

    @JsonProperty
    private String fee_type;

    @JsonProperty
    private long u_id;

    @JsonProperty
    private double fee_money;

    @JsonProperty
    private Timestamp fee_time;

    @JsonProperty
    private boolean fee_ispaid;
}


