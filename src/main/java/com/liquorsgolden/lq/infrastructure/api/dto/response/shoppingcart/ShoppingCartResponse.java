package com.liquorsgolden.lq.infrastructure.api.dto.response.shoppingcart;

import com.liquorsgolden.lq.infrastructure.api.dto.response.CustomerResponse;
import lombok.Data;

@Data
public class ShoppingCartResponse {

  private CustomerResponse customerResponse;
}
