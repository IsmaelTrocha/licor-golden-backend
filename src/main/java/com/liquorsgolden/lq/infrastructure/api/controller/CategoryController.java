package com.liquorsgolden.lq.infrastructure.api.controller;

import static com.liquorsgolden.lq.shared.utils.CustomHeader.X_AUTH_EMAIL;

import com.liquorsgolden.lq.application.category.CreateCategoryApplication;
import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.request.CategoryRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CreateResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.request.CategoryRequestMapper;
import com.liquorsgolden.lq.shared.exception.code.MessageCode;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/category")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class CategoryController {

  private final CreateCategoryApplication categoryApplication;
  private final CategoryRequestMapper categoryRequestMapper;
  private final MessageUtils messageUtils;

  @PostMapping
  public ResponseEntity<CreateResponse> createCategory(@RequestBody CategoryRequest categoryRequest,
      @RequestHeader(X_AUTH_EMAIL) String createBy) {
    Category category = categoryApplication.createCategory(
        categoryRequestMapper.toEntity(categoryRequest), createBy);
    return new ResponseEntity<>(new CreateResponse(
        messageUtils.getMessage(MessageCode.SUCCESSFUL.getCode()),
        messageUtils.getMessage(MessageCode.CATEGORY_CREATE_SUCCESSFULLY.getType())
    ), HttpStatus.CREATED);
  }





}
