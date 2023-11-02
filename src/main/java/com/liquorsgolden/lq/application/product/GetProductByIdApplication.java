package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetProductByIdService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class GetProductByIdApplication {

  private final GetProductByIdService getProductByIdService;

  public Product getProduct (Long id){
    return getProductByIdService.getProduct(id);
  }

  public Product getProductByName(String name){
    return getProductByIdService.getProductByName(name);
  }
}
