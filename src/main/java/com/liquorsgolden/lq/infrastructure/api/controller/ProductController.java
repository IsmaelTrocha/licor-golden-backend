package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.CreateProductApplication;
import com.liquorsgolden.lq.domain.entities.ImageUpload;
import com.liquorsgolden.lq.infrastructure.api.dto.request.ProductRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CreateResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.request.ProductRequestMapper;
import java.io.IOException;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

  private final CreateProductApplication createProductApplication;
  private final ImageUploadApplication imageUploadApplication;
  private final ProductRequestMapper productRequestMapper;

  @PostMapping
  public ResponseEntity<CreateResponse> createProduct(
      @RequestPart("product") ProductRequest productRequest,
      @RequestPart("file") MultipartFile multipartFile) throws IOException {
    ImageUpload img = imageUploadApplication.imageUpload(multipartFile);
    String resource = img.getResource();
    productRequest.setImageUrl(resource);
    createProductApplication.createPro(productRequestMapper.toEntity(productRequest));
    return new ResponseEntity<>(new CreateResponse("201", "Product was created successfully!!"),
        HttpStatus.CREATED);
  }

}
