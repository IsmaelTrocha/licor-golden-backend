package com.liquorsgolden.lq.infrastructure.api.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

  private String name;
  private String description;
  private String imageUrl;
  private Double price;
  private int stock;
  private String category;

}
