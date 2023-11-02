package com.liquorsgolden.lq.infrastructure.api.mapper.image;

import com.liquorsgolden.lq.domain.entities.ImageUpload;
import com.liquorsgolden.lq.infrastructure.api.dto.response.ImageUploadResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ImageUploadResponseMapper {

  ImageUploadResponse toDto(ImageUpload imageUpload);

  ImageUpload toEntity(ImageUploadResponse imageUploadResponse);
}
