package com.liquorsgolden.lq.shared.exception.message.category;

import com.liquorsgolden.lq.shared.exception.base.BaseException;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CategoryAlreadyExists extends BaseException {

  public CategoryAlreadyExists(String message){
    super(false, HttpStatus.FOUND,message, ExceptionCode.TEST);
  }

}
