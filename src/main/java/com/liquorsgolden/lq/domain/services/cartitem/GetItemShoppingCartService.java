package com.liquorsgolden.lq.domain.services.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import java.util.List;

public interface GetItemShoppingCartService {

  List<CartItem> allItems();
}
