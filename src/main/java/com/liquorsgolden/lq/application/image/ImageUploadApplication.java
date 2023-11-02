package com.liquorsgolden.lq.application.image;

import com.liquorsgolden.lq.domain.entities.ImageUpload;
import com.liquorsgolden.lq.domain.services.image.ImageUploadService;
import lombok.AllArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
public class ImageUploadApplication {

  private final ImageUploadService uploadService;

  public ImageUpload imageUpload(MultipartFile uploadFile) {

    return uploadService.upload(uploadFile);
  }

}
