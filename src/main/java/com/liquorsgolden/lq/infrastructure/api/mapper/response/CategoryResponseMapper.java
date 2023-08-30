package com.liquorsgolden.lq.infrastructure.api.mapper.response;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CategoryResponse;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CategoryResponseMapper extends EntityToDto<Category, CategoryResponse> {

}
