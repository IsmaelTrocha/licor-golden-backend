package com.liquorsgolden.lq.shared.exception.message.status;

import com.liquorsgolden.lq.shared.exception.base.BaseException;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class StatusNotFoundException extends BaseException {


  public StatusNotFoundException(String message) {
    super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.STATUS_NOT_FOUND);
  }
}
