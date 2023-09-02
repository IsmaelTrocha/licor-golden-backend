package com.liquorsgolden.lq.shared.exception.message.product;

import com.liquorsgolden.lq.shared.exception.base.BaseException;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;


public class ProductAlreadyExists extends BaseException {

  public ProductAlreadyExists(String message) {
    super(false, HttpStatus.FOUND, message, ExceptionCode.TEST);
  }
}
