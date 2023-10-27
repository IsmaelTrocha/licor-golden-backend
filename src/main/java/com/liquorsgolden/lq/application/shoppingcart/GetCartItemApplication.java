package com.liquorsgolden.lq.application.shoppingcart;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.shoppingcart.GetItemShoppingCartService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCartItemApplication {

  private final GetItemShoppingCartService getItemShoppingCartService;

  public List<CartItem> getItems() {
    return getItemShoppingCartService.allItems();
  }
}
