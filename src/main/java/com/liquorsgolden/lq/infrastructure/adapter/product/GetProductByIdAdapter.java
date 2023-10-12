package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetProductByIdService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@AllArgsConstructor
@Repository
public class GetProductByIdAdapter implements GetProductByIdService {

  private final ProductRepository productRepository;
  private final ProductDtoMapper productDtoMapper;


  public Product getProduct(Long id) {
    Optional<ProductDto> productDto = productRepository.findById(id);
    return productDto.map(productDtoMapper::toEntity).orElse(null);
  }
}