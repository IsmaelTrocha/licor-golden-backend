package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.shoppingcart.AddICartItemApplication;
import com.liquorsgolden.lq.application.shoppingcart.GetCartItemApplication;
import com.liquorsgolden.lq.application.shoppingcart.UpdateQuantityCartItemApplication;
import com.liquorsgolden.lq.infrastructure.adapter.shoppingcart.RemoveItemShoppingCartAdapter;
import com.liquorsgolden.lq.infrastructure.api.mapper.shoppingcart.ShoppingCartRequestMapper;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem.CartItemRepository;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerRepository;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cart-item")
@AllArgsConstructor
public class CartItemController {

  private final AddICartItemApplication addICartItemApplication;
  private final GetCartItemApplication getCartItemApplication;
  private final RemoveItemShoppingCartAdapter removeItemShoppingCartAdapter;
  private final UpdateQuantityCartItemApplication updateQuantityCartItemApplication;
  private final ShoppingCartRequestMapper shoppingCartRequestMapper;
  private final MessageUtils messageUtils;
  private final CartItemRepository cartItemRepository;
  private final CustomerRepository customerRepository;

}
