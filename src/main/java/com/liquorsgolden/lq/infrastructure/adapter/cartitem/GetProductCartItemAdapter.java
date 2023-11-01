package com.liquorsgolden.lq.infrastructure.adapter.cartitem;

import com.liquorsgolden.lq.domain.entities.CartItem;
import com.liquorsgolden.lq.domain.services.cartitem.GetCartItemService;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProductCartItemAdapter implements GetCartItemService {

  private final CartItemRepository cartItemRepository;
  private final CartItemDtoMapper cartItemDtoMapper;

  @Override
  public List<CartItem> allItems() {
    return cartItemDtoMapper.toEntity(cartItemRepository.findAll());
  }
}
