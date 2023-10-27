package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.entities.ShoppingCart;
import com.liquorsgolden.lq.domain.services.shoppingcart.AddItemShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.ShoppingCartDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddItemShoppingCartAdapter implements AddItemShoppingCartService {

  private final ShoppingCartDtoMapper shoppingCartDtoMapper;
  private final ShoppingCartRepository shoppingCartRepository;

  @Override
  public ShoppingCart addItem(ShoppingCart shoppingCart) {
    return shoppingCartDtoMapper.toEntity(
        shoppingCartRepository.save(shoppingCartDtoMapper.toDto(shoppingCart)));
  }
}
