package com.liquorsgolden.lq.infrastructure.api.dto.request.cartitem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CartItemRequest {

  private Long productId;
  private int quantity;
  private Long cartId;

}
