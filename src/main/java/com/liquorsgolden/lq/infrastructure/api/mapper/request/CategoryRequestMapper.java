package com.liquorsgolden.lq.infrastructure.api.mapper.request;

import com.liquorsgolden.lq.domain.entities.Category;
import com.liquorsgolden.lq.infrastructure.api.dto.request.CategoryRequest;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CategoryRequestMapper extends EntityToDto<Category, CategoryRequest> {
}
