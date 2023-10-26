package com.liquorsgolden.lq.infrastructure.api.mapper.product.response;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.response.product.ProductResponse;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductResponseMapper extends EntityToDto<Product, ProductResponse> {

    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "status.id", target = "statusId")
    @Mapping(source = "proportion.id", target = "proportionId")
    ProductResponse toDto(Product product);

    List<ProductResponse> toListDto(List<Product> products);

}
