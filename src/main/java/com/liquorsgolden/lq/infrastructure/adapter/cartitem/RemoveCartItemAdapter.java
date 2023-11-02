package com.liquorsgolden.lq.infrastructure.adapter.cartitem;

import com.liquorsgolden.lq.domain.services.cartitem.RemoveCartItemService;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RemoveCartItemAdapter implements RemoveCartItemService {

  private final CartItemRepository cartItemRepository;

  @Override
  public void removeCartItem(Long id) {
    cartItemRepository.deleteById(id);
  }
}
