package com.liquorsgolden.lq.infrastructure.api.dto.response.status;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StatusResponse {

  private Long id;
  private String name;
}
