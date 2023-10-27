package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.entities.ShoppingCart;
import com.liquorsgolden.lq.domain.services.shoppingcart.GetItemShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.ShoppingCartDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.ShoppingCartRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProductShoppingCartAdapter implements GetItemShoppingCartService {

  private final ShoppingCartRepository shoppingCartRepository;
  private final ShoppingCartDtoMapper shoppingCartDtoMapper;

  @Override
  public List<ShoppingCart> allItems() {
    return shoppingCartDtoMapper.toEntity(shoppingCartRepository.findAll());
  }
}
