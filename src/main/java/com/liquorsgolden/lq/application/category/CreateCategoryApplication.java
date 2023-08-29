package com.liquorsgolden.lq.application.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class CreateCategoryApplication {

  private final CreateCategoryService createCategoryService;

  public Category createCategory(@NonNull Category category, String createAt) {
    category.setCreateBy(createAt);
    category.setCreationDate(LocalDateTime.now());
    return createCategoryService.createCategory(category);
  }

}