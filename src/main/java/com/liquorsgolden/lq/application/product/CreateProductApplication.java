package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CreateProductApplication {

  private final CreateProductService createProductService;

  public Product createProduct(Product product) {
    return createProductService.createProduct(product);
  }
}
