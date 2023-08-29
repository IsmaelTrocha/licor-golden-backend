package com.liquorsgolden.lq.domain.services.category;

import com.liquorsgolden.lq.domain.entities.Category;

public interface GetCategoryService {

  Category findById(Long id);

}
