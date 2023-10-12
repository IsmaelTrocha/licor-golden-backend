package com.liquorsgolden.lq.infrastructure.adapter.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.GetCategoryService;
import com.liquorsgolden.lq.infrastructure.repository.category.CategoryDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.category.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Repository
public class GetCategoryAdapter implements GetCategoryService {

  private final CategoryRepository categoryRepository;
  private final CategoryDtoMapper categoryDtoMapper;

  @Override
  public Category findById(Long id) {
    return categoryDtoMapper.toEntity(categoryRepository.findById(id).orElse(null));
  }
}
