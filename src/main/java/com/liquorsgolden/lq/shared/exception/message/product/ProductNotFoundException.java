package com.liquorsgolden.lq.shared.exception.message.product;

import com.liquorsgolden.lq.shared.exception.base.BaseException;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends BaseException {

  public ProductNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.CATEGORY_ALREADY_EXISTS);
  }
}
