package com.liquorsgolden.lq.infrastructure.adapter.cartitem;

import com.liquorsgolden.lq.domain.services.cartitem.RemoveCartItemService;
 import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemRepository;
 import lombok.AllArgsConstructor;

import com.liquorsgolden.lq.domain.services.shoppingcart.RemoveItemShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RemoveCartItemAdapter implements RemoveCartItemService {

  private final CartItemRepository cartItemRepository;

  @Override
  public void removeCartItem(Long id) {
    cartItemRepository.deleteById(id);
public class RemoveCartItemAdapter implements RemoveItemShoppingCartService {

  private final ProductRepository productRepository;


  @Override
  public void removeItem(Long id) {
    productRepository.deleteById(id);
  }
}
