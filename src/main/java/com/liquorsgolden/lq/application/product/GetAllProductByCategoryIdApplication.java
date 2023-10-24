package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetAllProductByCategoryIdService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllProductByCategoryIdApplication {

    private final GetAllProductByCategoryIdService getAllProductByCategoryIdService;

    public List<Product> getProductByCategory(Long categoryId) {
        return getAllProductByCategoryIdService.getProductsbyCategory(categoryId);
    }

}
