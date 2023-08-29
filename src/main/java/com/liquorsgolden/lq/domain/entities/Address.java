package com.liquorsgolden.lq.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

  private Long id;
  private String street;
  private String avenue;
  private String description;
  private City city;
  private String postalCode;
  private User user;

}
