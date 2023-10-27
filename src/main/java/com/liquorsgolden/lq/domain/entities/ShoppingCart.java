package com.liquorsgolden.lq.domain.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCart {

  private Long id;
  private Customer customer;
  private Product product;
  private int quantity;
  private LocalDateTime insertionDate;
  private LocalDateTime updateDate;

}
