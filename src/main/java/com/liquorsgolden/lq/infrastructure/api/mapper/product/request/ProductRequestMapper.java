package com.liquorsgolden.lq.infrastructure.api.mapper.product.request;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.request.product.ProductRequest;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ProductRequestMapper extends EntityToDto<Product, ProductRequest> {


  @Mapping(source = "categoryId",target = "category.id")
  @Mapping(source = "statusId",target = "status.id")
  Product toEntity(ProductRequest request);
}
