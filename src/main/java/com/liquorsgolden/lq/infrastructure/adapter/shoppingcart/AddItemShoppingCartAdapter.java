package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.shoppingcart.AddItemShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem.CartItemDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem.CartItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddItemShoppingCartAdapter implements AddItemShoppingCartService {

  private final CartItemDtoMapper cartItemDtoMapper;
  private final CartItemRepository cartItemRepository;

  @Override
  public CartItem addItem(CartItem cartItem) {
    return cartItemDtoMapper.toEntity(
        cartItemRepository.save(cartItemDtoMapper.toDto(cartItem)));
  }
}
