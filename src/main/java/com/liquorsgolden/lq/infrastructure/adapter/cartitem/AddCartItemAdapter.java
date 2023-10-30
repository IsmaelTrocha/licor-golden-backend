package com.liquorsgolden.lq.infrastructure.adapter.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.cartitem.AddCartItemService;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddCartItemAdapter implements AddCartItemService {

  private final CartItemRepository cartItemRepository;
  private final CartItemDtoMapper cartItemDtoMapper;

  @Override
  public CartItem addCartItem(CartItem cartItem) {
    return cartItemDtoMapper.toEntity(cartItemRepository.save(cartItemDtoMapper.toDto(cartItem)));

  }
}
