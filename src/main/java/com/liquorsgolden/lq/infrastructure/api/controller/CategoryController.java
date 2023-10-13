package com.liquorsgolden.lq.infrastructure.api.controller;

import static com.liquorsgolden.lq.shared.utils.CustomHeader.X_AUTH_EMAIL;

import com.liquorsgolden.lq.application.category.GetAllCategoryApplication;
import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CreateResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.category.CategoryResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.product.ProductResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.category.CategoryResponseMapper;
import com.liquorsgolden.lq.shared.exception.code.MessageCode;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "category")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class CategoryController {

  private final GetAllCategoryApplication getAllCategoryApplication;
  private final CategoryResponseMapper categoryResponseMapper;

  @GetMapping("/list")
  public ResponseEntity<List<CategoryResponse>> getAllCategorys() {
    return new ResponseEntity<>(
            categoryResponseMapper.toDto(getAllCategoryApplication.getAllCategory()),
            HttpStatus.OK);
  }





}
