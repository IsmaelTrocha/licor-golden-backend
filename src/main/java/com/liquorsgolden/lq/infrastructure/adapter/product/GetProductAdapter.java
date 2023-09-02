package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetProductService;
import com.liquorsgolden.lq.infrastructure.mapper.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetProductAdapter implements GetProductService {

  private final ProductRepository productRepository;
  private final ProductDtoMapper productDtoMapper;

  @Override
  public Product findById(Long id) {
    return productDtoMapper.toEntity(productRepository.findById(id).orElse(null));
  }
}
