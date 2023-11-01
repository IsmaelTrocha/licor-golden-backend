package com.liquorsgolden.lq.application.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.cartitem.GetCartItemService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCartItemApplication {

  private final GetCartItemService getCartItemService;

  public List<CartItem> getItems() {
    return getCartItemService.allItems();
  }
}
