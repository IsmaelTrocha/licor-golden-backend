package com.liquorsgolden.lq.application.cartitem;

import com.liquorsgolden.lq.domain.services.cartitem.RemoveCartItemService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RemoveCartItemApplication {

  private final RemoveCartItemService removeCartItemService;

  public void removeCartItem(Long id) {
    removeCartItemService.removeCartItem(id);
  }
}
