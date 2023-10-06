package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.PutProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PutProductAdapter implements PutProductService<Product> {

  private final ProductRepository productRepository;

  @Override
  @Transactional
  public void updateProductService(Product product) {
    productRepository.modifyProduct(
        product.getName(),
        product.getDescription(),
        product.getPrice(),
        product.getId());
  }
}