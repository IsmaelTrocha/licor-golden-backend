package com.liquorsgolden.lq.infrastructure.api.dto.request.shoppingcart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartRequest {

  private Long productId;
  private Long customerId;

}
