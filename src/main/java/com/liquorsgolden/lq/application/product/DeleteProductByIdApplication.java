package com.liquorsgolden.lq.application.product;


import com.liquorsgolden.lq.domain.services.product.DeleteProductByIdService;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class DeleteProductByIdApplication {

  private final DeleteProductByIdService deleteProductByIdService;

  public void deleteProduct(Long id){
    deleteProductByIdService.deleteProduct(id);
  }

}
