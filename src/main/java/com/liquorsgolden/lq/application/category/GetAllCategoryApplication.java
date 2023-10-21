package com.liquorsgolden.lq.application.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.GetAllCategoryService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GetAllCategoryApplication {

    private final GetAllCategoryService getAllCategoryService;

    public List<Category> getAllCategory() {
        return getAllCategoryService.getAllCategorys();
    }
}
