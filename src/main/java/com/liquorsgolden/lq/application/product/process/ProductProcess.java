package com.liquorsgolden.lq.application.product.process;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import com.liquorsgolden.lq.shared.exception.message.product.ImageRequiredException;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductProcess {

  private final MessageUtils messageUtils;

  public void validateImage(Product product) {
    if (product.getImageUrl() == null || product.getImageUrl().isEmpty()) {
      throw new ImageRequiredException(messageUtils.getMessage(ExceptionCode.IMAGE_REQUIRED.getType()));
    }
  }
}
