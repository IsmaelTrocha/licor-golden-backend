package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetAllProductService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import java.util.List;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import org.springframework.stereotype.Repository;


@AllArgsConstructor
@Service
public class GetAllProductAdapter implements GetAllProductService {

    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    @Override
    public List<Product> getAllProduct() {
        List<ProductDto> productDtoList = productRepository.findAll();
        return productDtoMapper.toEntity(productDtoList);
    }

}
