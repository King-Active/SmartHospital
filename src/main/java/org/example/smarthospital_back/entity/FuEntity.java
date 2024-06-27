package org.example.smarthospital_back.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

public class FuEntity {
    @JsonProperty
    private long fu_id;

    @JsonProperty
    private String fu_name;

    @JsonProperty
    private double fu_x;

    @JsonProperty
    private double fu_y;

    @JsonProperty
    private int m_id;

}
