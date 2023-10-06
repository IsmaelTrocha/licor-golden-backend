package com.liquorsgolden.lq.application.product;


import com.liquorsgolden.lq.domain.services.product.DeleteProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteProductApplication {

  private final DeleteProductService productDeleteProductService;

  public void deleteProduct(Long id){
    productDeleteProductService.deleteProduct(id);

  }

}
