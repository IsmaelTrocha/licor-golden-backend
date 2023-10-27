package com.liquorsgolden.lq.domain.services.shoppingcart;

import com.liquorsgolden.lq.domain.entities.CartItem;
import java.util.List;

public interface GetItemShoppingCartService {

  List<CartItem> allItems();
}
