package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateProductApplication {

  private final ProductProcess productProcess;
  private final CreateProductService createProductService;

  public Product createProduct(Product product) {
    productProcess.validateImage(product);
    return createProductService.createProduct(product);
  }
}
