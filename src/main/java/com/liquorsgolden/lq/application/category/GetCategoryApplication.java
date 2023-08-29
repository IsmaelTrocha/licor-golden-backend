package com.liquorsgolden.lq.application.category;

import com.liquorsgolden.lq.application.category.process.CategoryProcess;
import com.liquorsgolden.lq.domain.entities.Category;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCategoryApplication {

  private final CategoryProcess categoryProcess;

  public Category findById(Long id) {
    return categoryProcess.findById(id);
  }

}
