package com.liquorsgolden.lq.infrastructure.api.mapper.response;


import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.response.ProductResponse;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ProductResponseMapper extends EntityToDto<Product, ProductResponse> {

}
