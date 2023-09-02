package com.liquorsgolden.lq.shared.exception.message.product;

import com.liquorsgolden.lq.shared.exception.base.BaseException;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class ImageRequiredException extends BaseException {

  public ImageRequiredException(String message) {
    super(false, HttpStatus.BAD_REQUEST, message, ExceptionCode.IMAGE_REQUIRED);
  }
}
