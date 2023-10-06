package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetProductService;
import com.liquorsgolden.lq.infrastructure.mapper.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetProductAdapter implements GetProductService<Product> {

  private final ProductRepository productRepository;
  private final ProductDtoMapper productDtoMapper;
  @Override
  public List<Product> getAllProducts(){
    return productDtoMapper.toEntity(productRepository.findAll()); //toEntity(toDto(productos)
  }

  @Override
  public Product getProduct(Long id) {
    return productDtoMapper.toEntity(productRepository.findById(id).orElse(null));
  }


}
