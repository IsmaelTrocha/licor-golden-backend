package com.liquorsgolden.lq.shared.exception.message.proportion;

import com.liquorsgolden.lq.shared.exception.base.BaseException;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class ProportionNotFoundException extends BaseException {


  public ProportionNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.PROPORTION_NOT_FOUND);
  }
}
