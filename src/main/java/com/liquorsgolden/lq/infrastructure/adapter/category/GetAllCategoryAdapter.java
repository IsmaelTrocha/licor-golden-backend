package com.liquorsgolden.lq.infrastructure.adapter.category;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.domain.services.category.GetAllCategoryService;
import com.liquorsgolden.lq.infrastructure.repository.category.CategoryDto;
import com.liquorsgolden.lq.infrastructure.repository.category.CategoryDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.category.CategoryRepository;
import com.liquorsgolden.lq.shared.exception.message.category.CategoryNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@AllArgsConstructor
@Repository
public class GetAllCategoryAdapter implements GetAllCategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryDtoMapper categoryDtoMapper;
    @Override
    public List<Category> getAllCategorys() {
        List<CategoryDto> categoryDtoList = categoryRepository.findAll();
        if (categoryDtoList.isEmpty()) {
            throw new CategoryNotFoundException(
                    "No existen categorias registradas en BD");
        }
        return categoryDtoMapper.toEntity(categoryDtoList);
    }
}
