package com.liquorsgolden.lq.infrastructure.api.dto.response.address;

import com.liquorsgolden.lq.infrastructure.api.dto.response.CustomerResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.city.CityResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

  private Long id;
  private String street;
  private String avenue;
  private String description;
  private CityResponse city;
  private String postalCode;

}
