package com.liquorsgolden.lq.application.product;


import com.liquorsgolden.lq.domain.services.product.DeleteProductByIdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DeleteProductByIdApplication {

  private final DeleteProductByIdService deleteProductByIdService;

  public void deleteProduct(Long id){
    deleteProductByIdService.deleteProduct(id);
  }

}
