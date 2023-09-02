package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductApplication {

  private final ProductProcess productProcess;
  private final CreateProductService createProductService;

  public Product createPro(Product product) {
    productProcess.validateImage(product);
    return createProductService.createProduct(product);
  }
}
