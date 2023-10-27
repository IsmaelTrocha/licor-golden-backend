package com.liquorsgolden.lq.domain.services.shoppingcart;

import com.liquorsgolden.lq.domain.entities.ShoppingCart;
import java.util.List;

public interface GetItemShoppingCartService {

  List<ShoppingCart> allItems();
}
