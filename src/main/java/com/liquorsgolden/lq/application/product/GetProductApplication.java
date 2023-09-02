package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetProductApplication {

  private final GetProductService getProductService;

  public Product findById(Long id) {
    return getProductService.findById(id);
  }
}
