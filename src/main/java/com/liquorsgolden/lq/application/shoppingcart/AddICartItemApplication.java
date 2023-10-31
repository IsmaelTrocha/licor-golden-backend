package com.liquorsgolden.lq.application.shoppingcart;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.shoppingcart.AddItemShoppingCartService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddICartItemApplication {

  private final AddItemShoppingCartService addItemShoppingCartService;

  public CartItem addItemShoppingCart(CartItem cartItem){
    return addItemShoppingCartService.addItem(cartItem);
  }
}
