package com.liquorsgolden.lq.infrastructure.adapter.cart;

import com.liquorsgolden.lq.domain.entities.Cart;
import com.liquorsgolden.lq.domain.services.cart.AddShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.cart.CartDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.cart.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateCartAdapter implements AddShoppingCartService {


  private final CartRepository cartRepository;
  private final CartDtoMapper cartDtoMapper;

  @Override
  public Cart addCart(Cart cart) {
    return cartDtoMapper.toEntity(cartRepository.save(cartDtoMapper.toDto(cart)));
  }
}
