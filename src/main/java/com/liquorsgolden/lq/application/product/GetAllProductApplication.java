package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetAllProductService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllProductApplication {

    private final GetAllProductService getAllProductService;

    public List<Product> getAllProducts() {
        return getAllProductService.getAllProduct();
    }
}
