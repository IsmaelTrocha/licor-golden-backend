package com.liquorsgolden.lq.application.cartitem;

import com.liquorsgolden.lq.domain.services.cartitem.UpdateQuantityCartItemService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateQuantityCartItemApplication {

  private final UpdateQuantityCartItemService updateQuantityCartItemService;

  public void updateQuantityItemCartService(int quantity, Long id) {
    updateQuantityCartItemService.updateQuantity(quantity, id);
  }
}
