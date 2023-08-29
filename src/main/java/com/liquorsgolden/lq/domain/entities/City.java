package com.liquorsgolden.lq.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

  private Long id;
  private String name;
  private Country country;

}
