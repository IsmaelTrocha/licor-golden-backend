package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.*;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.request.product.ProductRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.request.product.ProductUpdateRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.response.ImageUploadResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.product.ProductResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.request.product.ProductRequestMapper;

import com.liquorsgolden.lq.infrastructure.api.mapper.request.product.ProductUpdateRequestMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.response.ImageUploadResponseMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.response.ProductResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

  private final CreateProductApplication createProductApplication;
  private final GetProductByIdApplication getProductByIdApplication;
  private final ImageUploadApplication imageUploadApplication;
  private final ProductRequestMapper productRequestMapper;
  private final ProductUpdateApplication productUpdateApplication;
  private final ProductUpdateRequestMapper productUpdateRequestMapper;
  private final DeleteProductByIdApplication deleteProductByIdApplication;
  private final ImageUploadResponseMapper imageUploadResponseMapper;
  private final ProductResponseMapper productResponseMapper;
  private final GetAllProductApplication getAllProductApplication;

  @GetMapping("/list")
  public ResponseEntity<List<ProductResponse>> getAllProducts() {
    return new ResponseEntity<>(
            productResponseMapper.toListDto(getAllProductApplication.getAllProducts()),
            HttpStatus.OK);
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<ProductResponse> getProduct(@PathVariable("id") Long id) {
     return ResponseEntity.ok(productResponseMapper.toDto(
            getProductByIdApplication.getProduct(id)));
  }

  @PostMapping(path = "/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  public ResponseEntity<ImageUploadResponse> uploadProductImage(
          @RequestPart("file") MultipartFile image){
    return ResponseEntity.ok(imageUploadResponseMapper.toDto(
            imageUploadApplication.imageUpload(image)));
  }

  @PostMapping("/create")
  public ResponseEntity<Long> save(@Valid @RequestBody ProductRequest productRequest) {
    Product productToUpdate = productRequestMapper.toEntity(productRequest);
    Product savedProduct = createProductApplication.createProduct(productToUpdate);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct.getId());
  }


  @PutMapping("/update")
  public ResponseEntity<Long> updateProduct(
          @Valid @RequestBody ProductUpdateRequest productUpdateRequest) {
    Product updatedProduct = productUpdateApplication.updateProduct(
            productUpdateRequestMapper.toEntity(productUpdateRequest));
    return ResponseEntity.status(HttpStatus.OK).body(updatedProduct.getId());
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteProduct(@PathVariable long id) {
    deleteProductByIdApplication.deleteProduct(id);
    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }

}