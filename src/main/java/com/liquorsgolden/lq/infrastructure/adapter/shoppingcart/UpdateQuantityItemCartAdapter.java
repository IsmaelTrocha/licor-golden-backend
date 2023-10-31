package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.services.shoppingcart.UpdateQuantityItemCartService;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.cartitem.CartItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateQuantityItemCartAdapter implements UpdateQuantityItemCartService {

  private final CartItemRepository cartItemRepository;

  @Override
  public void updateQuantity(int quantity, Long id) {
  cartItemRepository.updateShoppingCartQuantity(quantity,id);
  }
}
