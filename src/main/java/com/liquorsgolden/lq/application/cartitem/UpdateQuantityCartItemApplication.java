package com.liquorsgolden.lq.application.cartitem;

import com.liquorsgolden.lq.domain.services.cartitem.UpdateQuantityItemCartService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateQuantityCartItemApplication {

  private final UpdateQuantityItemCartService updateQuantityItemCartService;

  public void updateQuantityItemCartService(int quantity, Long id) {
    updateQuantityItemCartService.updateQuantity(quantity, id);
  }
}
