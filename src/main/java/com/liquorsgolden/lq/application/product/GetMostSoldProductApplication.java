package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.services.product.GetMostSoldProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetMostSoldProductApplication {

  private final GetMostSoldProductService getMostSoldProductService;

  public List<ProductDto> getMostSoldProducts() {
    return getMostSoldProductService.findByQuantitySold();
  }
}
