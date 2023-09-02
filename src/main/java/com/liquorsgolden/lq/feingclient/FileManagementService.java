package com.liquorsgolden.lq.feingclient;

import com.liquorsgolden.lq.domain.entities.ImageUpload;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "liquors-file-manager", url = "http://localhost:8081")
public interface FileManagementService {

  @PostMapping(value = "/images/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  ImageUpload uploadImage(@RequestPart("file") MultipartFile multipartFile);
}
