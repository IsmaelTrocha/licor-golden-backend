package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.domain.entities.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetProductApplication {

  private final ProductProcess productProcess;

  public Product findById(Long id) {
    return productProcess.findById(id);
  }
}
