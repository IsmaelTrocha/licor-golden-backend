package com.liquorsgolden.lq.application.shoppingcart;

import com.liquorsgolden.lq.domain.services.shoppingcart.UpdateQuantityItemCartService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UpdateQuantityItemCartApplication {

  private final UpdateQuantityItemCartService updateQuantityItemCartService;

  public void updateQuantityItemCartService(int quantity, Long id) {
    updateQuantityItemCartService.updateQuantity(quantity, id);
  }
}
