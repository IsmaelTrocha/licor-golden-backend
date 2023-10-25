package com.liquorsgolden.lq.infrastructure.api.dto.response.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

  private Long id;
  private String nameProduct;
  private Double price;
  private String description;
  private int stock;
  private String imageUrl;
  //Foreign keys
  private Long categoryId;
  private Long statusId;
  private Long proportionId;

  //private LocalDateTime expirationDate;

}
