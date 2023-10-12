package com.liquorsgolden.lq.infrastructure.api.dto.response.product;

import java.time.LocalDateTime;

import com.liquorsgolden.lq.infrastructure.api.dto.response.CategoryResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.StatusResponse;
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
  //Foreign keys
  private Long categoryId;
  private Long statusId;

  //private LocalDateTime expirationDate;

}
