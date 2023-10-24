package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetAllProductByProportionIdService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class GetAllProductByProportionIdAdapter implements GetAllProductByProportionIdService {

    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    @Override
    public List<Product> getProductsByProportion(Long proportionId) {
        return productDtoMapper.toEntity(productRepository.findByProportion_IdOrderByIdAsc(proportionId));
    }
}