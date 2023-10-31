package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.category.GetAllCategoryApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.response.category.CategoryResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.category.CategoryResponseMapper;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
