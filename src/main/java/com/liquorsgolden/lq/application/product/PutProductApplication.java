package com.liquorsgolden.lq.application.product;


import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.PutProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PutProductApplication {

  private final PutProductService<Product> putProductService;

  public void updateProduct(Product product) {
    putProductService.updateProductService(product);
  }
}
