package com.liquorsgolden.lq.infrastructure.api.dto.response;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

  private Long id;
  private String name;
  private CategoryResponse category;
  private Double price;
  private LocalDateTime expirationDate;
  private String description;
  private StatusResponse status;
  private int stock;

}
