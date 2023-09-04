package com.liquorsgolden.lq.infrastructure.mapper;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING, uses = {
    CategoryDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductDtoMapper extends EntityToDto<Product, ProductDto> {

}
