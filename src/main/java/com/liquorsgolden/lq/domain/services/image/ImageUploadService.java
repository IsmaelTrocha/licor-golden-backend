package com.liquorsgolden.lq.domain.services.image;

import com.liquorsgolden.lq.domain.entities.ImageUpload;
import org.springframework.web.multipart.MultipartFile;

public interface ImageUploadService {

  ImageUpload upload(MultipartFile uploadFile);
}
