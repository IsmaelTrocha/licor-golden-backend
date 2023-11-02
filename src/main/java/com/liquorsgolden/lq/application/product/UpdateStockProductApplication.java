package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.services.product.UpdateStockProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateStockProductApplication {

  private final UpdateStockProductService updateStockProductService;

  public void updateStockProduct(int stock, String nameProduct) {
    updateStockProductService.updateStockProduct(stock, nameProduct);
  }
}
