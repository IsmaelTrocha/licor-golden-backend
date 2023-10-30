package com.liquorsgolden.lq.infrastructure.api.mapper.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CartRequest {

  private Long customerId;
}
