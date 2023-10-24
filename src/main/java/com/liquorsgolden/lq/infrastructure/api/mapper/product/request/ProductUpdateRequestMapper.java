package com.liquorsgolden.lq.infrastructure.api.mapper.product.request;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.request.product.ProductUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductUpdateRequestMapper {

    @Mapping(source = "productId", target = "id")
    @Mapping(source = "categoryId",target = "category.id")
    @Mapping(source = "statusId",target = "status.id")
    Product toEntity(ProductUpdateRequest productUpdateRequest);

}
