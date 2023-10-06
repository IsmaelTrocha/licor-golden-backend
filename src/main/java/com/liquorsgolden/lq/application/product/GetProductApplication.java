package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.GetProductService;
import java.util.List;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class GetProductApplication {


  private final GetProductService<Product> getProductService;

  public List<Product> getAllProducts(){
    return getProductService.getAllProducts();
  }

  public Product getProduct (Long id){
    return getProductService.getProduct(id);
  }
}
