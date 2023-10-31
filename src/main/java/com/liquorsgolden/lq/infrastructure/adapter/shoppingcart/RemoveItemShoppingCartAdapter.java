package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.services.shoppingcart.RemoveItemShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RemoveItemShoppingCartAdapter implements RemoveItemShoppingCartService {

  private final ProductRepository productRepository;


  @Override
  public void removeItem(Long id) {
    productRepository.deleteById(id);
  }
}
