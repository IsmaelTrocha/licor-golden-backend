package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetMostSoldProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class GetMostSoldProductAdapter implements GetMostSoldProductService {

  private final ProductRepository productRepository;
  private final ProductDtoMapper productDtoMapper;
  @Override
  public List<Product> findByQuantitySold(){
    return productDtoMapper.toEntity(productRepository.findByQuantitySold());
  }

}
