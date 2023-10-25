package com.liquorsgolden.lq.shared.exception.code;

import lombok.Getter;

@Getter
public enum ExceptionCode {

    TEST("", ""),
    CATEGORY_ALREADY_EXISTS("ERR-01","Exception.CATEGORY_ALREADY_EXISTS"),
    CATEGORY_NOT_FOUND("ERR-02","Exception.CATEGORY_NOT_FOUND"),
    IMAGE_REQUIRED("ERR-03","Exception.IMAGE_REQUIRED"),
    STATUS_NOT_FOUND("ERR-04","Exception.STATUS_NOT_FOUND"),
    PROPORTION_NOT_FOUND("ERR-05","Exception.PROPORTION_NOT_FOUND");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}