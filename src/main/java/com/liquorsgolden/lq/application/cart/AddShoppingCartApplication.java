package com.liquorsgolden.lq.application.cart;

import com.liquorsgolden.lq.application.customer.GetCustomerByIdApplication;
import com.liquorsgolden.lq.domain.entities.Cart;
import com.liquorsgolden.lq.domain.services.cart.AddShoppingCartService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddShoppingCartApplication {

  private final AddShoppingCartService addShoppingCartService;
  private final GetCustomerByIdApplication getCustomerByIdApplication;

  public Cart addCart(Cart cart) {

    cart.setCustomer(getCustomerByIdApplication.getCustomerById(cart.getCustomer().getId()));
    return addShoppingCartService.addCart(cart);
  }
}
