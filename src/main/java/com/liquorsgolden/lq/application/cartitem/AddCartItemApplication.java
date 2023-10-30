package com.liquorsgolden.lq.application.cartitem;

import com.liquorsgolden.lq.application.cart.GetShoppingCartByIdApplication;
import com.liquorsgolden.lq.application.product.GetProductByIdApplication;
import com.liquorsgolden.lq.domain.entities.Cart;
import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.cartitem.AddCartItemService;
import java.time.LocalDateTime;
import java.util.Objects;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddCartItemApplication {

  private final AddCartItemService addCartItemService;
  private final GetShoppingCartByIdApplication cartByIdApplication;
  private final GetProductByIdApplication getProductByIdApplication;

  public CartItem addCartItem(CartItem cartItem) {
    Cart cart = cartByIdApplication.getCartById(cartItem.getCart().getId());
    Product product = getProductByIdApplication.getProduct(cartItem.getProduct().getId());
    if (Objects.isNull(cart)) {
      throw new RuntimeException("That cart does not exist");
    }
    if (Objects.isNull(product)) {
      throw new RuntimeException("That product does not exist");
    }

    cartItem.setInsertionDate(LocalDateTime.now());
    cartItem.setProduct(product);
    cartItem.setCart(cart);
    return addCartItemService.addCartItem(cartItem);
  }

}
