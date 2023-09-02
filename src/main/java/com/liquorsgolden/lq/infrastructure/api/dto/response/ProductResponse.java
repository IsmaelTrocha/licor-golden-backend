package com.liquorsgolden.lq.infrastructure.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

  private Long id;
  private String name;
  private String category;
  private Boolean status;
  private int stock;

}
