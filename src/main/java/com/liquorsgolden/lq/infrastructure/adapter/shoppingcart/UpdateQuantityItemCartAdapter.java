package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.services.shoppingcart.UpdateQuantityItemCartService;
import com.liquorsgolden.lq.infrastructure.repository.shoppingcart.ShoppingCartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateQuantityItemCartAdapter implements UpdateQuantityItemCartService {

  private final ShoppingCartRepository shoppingCartRepository;

  @Override
  public void updateQuantity(int quantity, Long id) {
  shoppingCartRepository.updateShoppingCartQuantity(quantity,id);
  }
}
