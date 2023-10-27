package com.liquorsgolden.lq.application.product;

import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import java.util.Objects;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductApplication {

  private final ProductProcess productProcess;
  private final GetProductByIdApplication getProductByIdApplication;
  private final CreateProductService createProductService;
  private final UpdateStockProductApplication updateStockProductApplication;

  public Product createProduct(Product product) {
    productProcess.validateImage(product);
    Product products = getProductByIdApplication.getProduct(product.getId());
    if (Objects.nonNull(products)) {
      updateStockProductApplication.updateStockProduct(
          products.getStock() + product.getStock(),
          products.getNameProduct());
    }
    return createProductService.createProduct(product);
  }
}
