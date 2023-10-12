package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetProductByIdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class GetProductByIdApplication {

  private final GetProductByIdService getProductByIdService;

  public Product getProduct (Long id){
    return getProductByIdService.getProduct(id);
  }
}
