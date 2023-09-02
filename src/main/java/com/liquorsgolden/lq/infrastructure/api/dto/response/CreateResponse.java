package com.liquorsgolden.lq.infrastructure.api.dto.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CreateResponse {

  private final LocalDateTime localDateTime = LocalDateTime.now();
  private String status;
  private String description;
}
