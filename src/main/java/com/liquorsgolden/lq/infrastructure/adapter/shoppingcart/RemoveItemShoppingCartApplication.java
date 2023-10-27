package com.liquorsgolden.lq.infrastructure.adapter.shoppingcart;

import com.liquorsgolden.lq.domain.services.shoppingcart.RemoveItemShoppingCartService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RemoveItemShoppingCartApplication implements RemoveItemShoppingCartService {

  private final ProductRepository productRepository;


  @Override
  public void removeItem(Long id) {
    productRepository.deleteById(id);
  }
}
