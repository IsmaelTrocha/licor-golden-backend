package com.liquorsgolden.lq.application.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.GetAllCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetAllCategoryApplication {

    private final GetAllCategoryService getAllCategoryService;

    public List<Category> getAllCategory() {
        return getAllCategoryService.getAllCategorys();
    }
}
