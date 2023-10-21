package com.liquorsgolden.lq.application.product;


import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.ProductUpdateService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductUpdateApplication {

  private final ProductUpdateService productUpdateService;

  public Product updateProduct(Product product) {
    return productUpdateService.updateProduct(product);
  }
}
