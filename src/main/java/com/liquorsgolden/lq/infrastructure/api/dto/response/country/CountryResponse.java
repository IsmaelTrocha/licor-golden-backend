package com.liquorsgolden.lq.infrastructure.api.dto.response.country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryResponse {

  private Long id;
  private String name;

}
