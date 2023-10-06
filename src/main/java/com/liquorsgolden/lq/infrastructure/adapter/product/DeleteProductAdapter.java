package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.DeleteProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeleteProductAdapter implements DeleteProductService<Product> {

  private final ProductRepository productRepository;

  @Override
  public void deleteProduct(Long id){
    productRepository.deleteById(id);
  }
}
