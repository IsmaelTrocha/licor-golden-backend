package com.liquorsgolden.lq.domain.services.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import java.util.List;

public interface GetMostSoldProductService {

 List<Product> findByQuantitySold();
}
