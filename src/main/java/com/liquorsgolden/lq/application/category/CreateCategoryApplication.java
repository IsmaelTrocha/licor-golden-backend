package com.liquorsgolden.lq.application.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateCategoryApplication {

    private final CreateCategoryService createCategoryService;

    public Category createCategory(Category category,String createAt){
        return createCategoryService.createCategory(category);
    }

}
