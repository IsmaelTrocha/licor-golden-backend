package com.liquorsgolden.lq.infrastructure.api.mapper.product.response;

import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.response.product.ProductResponse;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductResponseMapper {

    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "status.id", target = "statusId")
    @Mapping(source = "proportion.id", target = "proportionId")
    ProductResponse toDto(Product product);

    List<ProductResponse> toListDto(List<Product> products);

}
