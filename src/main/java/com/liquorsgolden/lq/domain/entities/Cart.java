package com.liquorsgolden.lq.domain.entities;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

  private Customer user;
  private List<CartItem> cartItems;

}
