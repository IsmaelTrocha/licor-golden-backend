package com.liquorsgolden.lq.infrastructure.api.mapper.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor


public class CreateResponse {

    private String status;
    private String description;
    private final LocalDateTime localDateTime = LocalDateTime.now();
}
