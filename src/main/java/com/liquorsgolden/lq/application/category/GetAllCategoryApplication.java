package com.liquorsgolden.lq.application.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.GetAllCategoryService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAllCategoryApplication {

    private final GetAllCategoryService getAllCategoryService;

    public List<Category> getAllCategory() {
        return getAllCategoryService.getAllCategorys();
    }
}
