package com.liquorsgolden.lq.domain.services.cart;

import com.liquorsgolden.lq.domain.entities.Cart;

public interface GetShoppingCartByIdService {

  Cart getCartById(Long id);
}
