package com.liquorsgolden.lq.infrastructure.api.dto.response.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {

  private Long id;
  private String name;
  private String createBy;

}
