package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetAllProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetAllProductApplication {

    private final GetAllProductService getAllProductService;

    public List<Product> getAllProducts() {
        return getAllProductService.getAllProduct();
    }
}
