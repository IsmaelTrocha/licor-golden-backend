package com.liquorsgolden.lq.infrastructure.api.dto.response.shoppingcart;

import com.liquorsgolden.lq.infrastructure.api.dto.response.CustomerResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.product.ProductResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartResponse {

  private Long id;
  private CustomerResponse customerResponse;
  private List<ProductResponse> productResponseList;

}
