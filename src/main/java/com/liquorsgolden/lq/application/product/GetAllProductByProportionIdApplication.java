package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetAllProductByProportionIdService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllProductByProportionIdApplication {

    private final GetAllProductByProportionIdService getAllProductByProportionIdService;

    public List<Product> getProductByProportion(Long proportionId) {
        return getAllProductByProportionIdService.getProductsByProportion(proportionId);
    }
}
