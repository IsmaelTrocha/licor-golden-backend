package com.liquorsgolden.lq.infrastructure.api.dto.response.city;

import com.liquorsgolden.lq.infrastructure.api.dto.response.country.CountryResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityResponse {

  private Long id;
  private String name;
  private CountryResponse countryResponse;

}
