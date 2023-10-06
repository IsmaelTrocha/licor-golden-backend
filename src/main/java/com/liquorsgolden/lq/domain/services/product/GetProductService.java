package com.liquorsgolden.lq.domain.services.product;

import java.util.List;

public interface GetProductService<Product> {

  List<Product> getAllProducts();

  Product getProduct(Long id);

}
