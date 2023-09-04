package com.liquorsgolden.lq.infrastructure.api.mapper.request;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.request.ProductRequest;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ProductRequestMapper extends EntityToDto<Product, ProductRequest> {


  @Mapping(source = "category",target = "category.id")
  Product toEntity(ProductRequest request);
}
