package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.shoppingcart.GetItemShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem.CartItemDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem.CartItemRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProductShoppingCartAdapter implements GetItemShoppingCartService {

  private final CartItemRepository cartItemRepository;
  private final CartItemDtoMapper cartItemDtoMapper;

  @Override
  public List<CartItem> allItems() {
    return cartItemDtoMapper.toEntity(cartItemRepository.findAll());
  }
}
