package com.liquorsgolden.lq.application.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.GetCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetCategoryApplication {

  private final GetCategoryService getCategoryService;

  public Category findById(Long id) {
    return getCategoryService.findById(id);
  }

}
