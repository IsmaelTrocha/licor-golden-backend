package com.liquorsgolden.lq.domain.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

  private Long id;
  private Product product;
  private int quantity;
  private LocalDateTime insertionDate;
  private LocalDateTime updateDate;
  private Cart cart;

}
