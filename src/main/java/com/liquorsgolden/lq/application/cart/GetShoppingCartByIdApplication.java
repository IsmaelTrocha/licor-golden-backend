package com.liquorsgolden.lq.application.cart;

import com.liquorsgolden.lq.domain.entities.Cart;
import com.liquorsgolden.lq.domain.services.cart.GetShoppingCartByIdService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetShoppingCartByIdApplication {

  private final GetShoppingCartByIdService getShoppingCartByIdService;

  public Cart getCartById(Long id) {
    return getShoppingCartByIdService.getCartById(id);
  }

}
