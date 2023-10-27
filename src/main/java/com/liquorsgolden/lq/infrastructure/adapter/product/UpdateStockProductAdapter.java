package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.services.product.UpdateStockProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateStockProductAdapter implements UpdateStockProductService {

  private final ProductRepository productRepository;


  @Override
  public void updateStockProduct(int stock, String id) {
  productRepository.updateStockProduct(stock, id);
  }
}
