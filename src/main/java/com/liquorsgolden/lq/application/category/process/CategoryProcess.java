package com.liquorsgolden.lq.application.category.process;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import com.liquorsgolden.lq.domain.services.category.GetCategoryService;
import com.liquorsgolden.lq.shared.exception.code.ExceptionCode;
import com.liquorsgolden.lq.shared.exception.message.category.CategoryAlreadyExists;
import com.liquorsgolden.lq.shared.exception.message.category.CategoryNotFoundException;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import java.util.Objects;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CategoryProcess {

  private final MessageUtils messageUtils;
  private final GetCategoryService getCategoryService;
  private final CreateCategoryService createCategoryService;

  public Category createCategory(Category category) {
    Category fakeCategory = getCategoryService.findById(category.getId());

    if (Objects.nonNull(fakeCategory)) {
      throw new CategoryAlreadyExists(
          messageUtils.getMessage(ExceptionCode.CATEGORY_ALREADY_EXISTS.getType(),
              fakeCategory.getId().toString()));
    }
    return createCategoryService.createCategory(category);
  }

  public Category findById(Long id) {
    Category category = getCategoryService.findById(id);
    if (Objects.isNull(category)) {
      throw new CategoryNotFoundException(
          messageUtils.getMessage(ExceptionCode.CATEGORY_NOT_FOUND.getType(), id.toString()));
    }
    return getCategoryService.findById(id);
  }

}
