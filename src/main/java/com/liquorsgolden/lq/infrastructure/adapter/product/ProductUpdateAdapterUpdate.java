package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.ProductUpdateService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Repository
public class ProductUpdateAdapterUpdate implements ProductUpdateService {

  private final ProductRepository productRepository;
  private final ProductDtoMapper productDtoMapper;
  @Override
  public Product updateProduct(Product product) {
    return productDtoMapper.toEntity(productRepository.save(productDtoMapper.toDto(product)));
  }
}