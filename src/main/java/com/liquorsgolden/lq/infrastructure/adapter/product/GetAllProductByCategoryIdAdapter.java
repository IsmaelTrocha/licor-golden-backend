package com.liquorsgolden.lq.infrastructure.adapter.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetAllProductByCategoryIdService;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class GetAllProductByCategoryIdAdapter implements GetAllProductByCategoryIdService {

    private final ProductRepository productRepository;
    private final ProductDtoMapper productDtoMapper;

    @Override
    public List<Product> getProductsbyCategory(Long categoryId) {
        return productDtoMapper.toEntity(productRepository.findByCategory_IdOrderByIdAsc(categoryId));
    }
}
