package com.liquorsgolden.lq.domain.services.product;

import com.liquorsgolden.lq.domain.entities.Product;

public interface GetProductService {

  Product findById(Long id);

}
