package com.liquorsgolden.lq.application.shoppingcart;

import com.liquorsgolden.lq.domain.entities.ShoppingCart;
import com.liquorsgolden.lq.domain.services.shoppingcart.GetItemShoppingCartService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetItemShoppingCartApplication {

  private final GetItemShoppingCartService getItemShoppingCartService;

  public List<ShoppingCart> getItems() {
    return getItemShoppingCartService.allItems();
  }
}
