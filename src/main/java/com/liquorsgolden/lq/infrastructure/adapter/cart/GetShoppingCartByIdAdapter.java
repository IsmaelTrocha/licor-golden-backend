package com.liquorsgolden.lq.infrastructure.adapter.cart;

import com.liquorsgolden.lq.domain.entities.Cart;
import com.liquorsgolden.lq.domain.services.cart.GetShoppingCartByIdService;
import com.liquorsgolden.lq.infrastructure.repository.cart.CartDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.cart.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetShoppingCartByIdAdapter implements GetShoppingCartByIdService {

  private final CartRepository cartRepository;
  private final CartDtoMapper cartDtoMapper;

  @Override
  public Cart getCartById(Long id) {
    return cartDtoMapper.toEntity(cartRepository.findById(id).orElse(null));
  }
}
