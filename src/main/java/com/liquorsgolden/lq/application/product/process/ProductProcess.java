package com.liquorsgolden.lq.application.product.process;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import com.liquorsgolden.lq.domain.services.product.GetProductService;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import com.liquorsgolden.lq.shared.exception.message.product.ProductAlreadyExists;
import com.liquorsgolden.lq.shared.exception.message.product.ProductNotFoundException;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductProcess {

  private final CreateProductService createProductService;
  private final GetProductService getProductService;
  private final MessageUtils messageUtils;

  public Product createProduct(Product product) {
    Product fakeProduct = getProductService.findById(product.getId());
    if (Objects.nonNull(fakeProduct)) {
      throw new ProductAlreadyExists(
          messageUtils.getMessage(ExceptionCode.CATEGORY_ALREADY_EXISTS.getType(),
              fakeProduct.getId().toString()));
    }
    return createProductService.createProduct(product);

  }

  public Product findById(Long id) {
    Product product = getProductService.findById(id);
    if (Objects.isNull(product)) {
      throw new ProductNotFoundException(
          messageUtils.getMessage(ExceptionCode.CATEGORY_NOT_FOUND.getType(), id.toString()));
    }
    return getProductService.findById(id);
  }
}