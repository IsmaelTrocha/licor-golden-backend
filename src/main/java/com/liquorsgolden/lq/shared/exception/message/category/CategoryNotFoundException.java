package com.liquorsgolden.lq.shared.exception.message.category;

import com.liquorsgolden.lq.shared.exception.base.BaseException;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CategoryNotFoundException extends BaseException {


  public CategoryNotFoundException(String message){
    super(false, HttpStatus.NOT_FOUND,message, ExceptionCode.CATEGORY_ALREADY_EXISTS);
    }
}
