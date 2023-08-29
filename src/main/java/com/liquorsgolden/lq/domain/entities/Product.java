package com.liquorsgolden.lq.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Long id;
  private String name;
  private String description;
  private String image;
  private Double price;
  private int stock;

}
