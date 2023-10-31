package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
=======
import org.springframework.stereotype.Repository;



@AllArgsConstructor
@Service
public class CreateProductAdapter implements CreateProductService {

  private final ProductRepository productRepository;
  private final ProductDtoMapper productDtoMapper;

  @Override
  public Product createProduct(Product product) {
    return productDtoMapper.toEntity(productRepository.save(productDtoMapper.toDto(product)));
  }
}
