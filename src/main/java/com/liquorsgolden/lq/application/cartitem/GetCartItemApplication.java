package com.liquorsgolden.lq.application.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.cartitem.GetItemShoppingCartService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCartItemApplication {

  private final GetItemShoppingCartService getItemShoppingCartService;

  public List<CartItem> getItems() {
    return getItemShoppingCartService.allItems();
  }
}
