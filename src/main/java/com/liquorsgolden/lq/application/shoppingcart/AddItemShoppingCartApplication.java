package com.liquorsgolden.lq.application.shoppingcart;

import com.liquorsgolden.lq.domain.entities.ShoppingCart;
import com.liquorsgolden.lq.domain.services.shoppingcart.AddItemShoppingCartService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddItemShoppingCartApplication {

  private final AddItemShoppingCartService addItemShoppingCartService;

  public ShoppingCart addItemShoppingCart(ShoppingCart shoppingCart){
    return addItemShoppingCartService.addItem(shoppingCart);
  }
}
