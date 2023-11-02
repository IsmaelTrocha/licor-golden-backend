package com.liquorsgolden.lq.infrastructure.adapter.cartitem;

import com.liquorsgolden.lq.domain.services.cartitem.UpdateQuantityCartItemService;
import com.liquorsgolden.lq.infrastructure.repository.cartitem.CartItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateQuantityCartItemAdapter implements UpdateQuantityCartItemService {

  private final CartItemRepository cartItemRepository;

  @Override
  public void updateQuantity(int quantity, Long id) {
    cartItemRepository.updateShoppingCartQuantity(quantity, id);
  }
}
