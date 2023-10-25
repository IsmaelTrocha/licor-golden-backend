package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.services.product.GetMostSoldProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class GetMostSoldProductAdapter implements GetMostSoldProductService {

  private final ProductRepository productRepository;
  @Override
  public List<ProductDto> findByQuantitySold(){
    return productRepository.findByQuantitySold();
  }

}
