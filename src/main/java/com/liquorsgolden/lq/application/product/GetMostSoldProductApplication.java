package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetMostSoldProductService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetMostSoldProductApplication {

  private final GetMostSoldProductService getMostSoldProductService;

  public List<Product> getMostSoldProducts() {
    return getMostSoldProductService.findByQuantitySold();
  }
}
