package com.liquorsgolden.lq.infrastructure.adapter.image;

import com.liquorsgolden.lq.domain.entities.ImageUpload;
import com.liquorsgolden.lq.domain.services.image.ImageUploadService;
import com.liquorsgolden.lq.domain.services.feingclient.FileManagementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@Service
public class ImageUploadAdapter implements ImageUploadService {

  private final FileManagementService fileManagementService;

  @Override
  public ImageUpload upload(MultipartFile uploadFile) {
    return fileManagementService.uploadImage(uploadFile);
  }
}
