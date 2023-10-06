package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.CreateProductApplication;
import com.liquorsgolden.lq.application.product.DeleteProductApplication;
import com.liquorsgolden.lq.application.product.GetProductApplication;
import com.liquorsgolden.lq.application.product.PutProductApplication;
import com.liquorsgolden.lq.domain.entities.ImageUpload;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.request.ProductRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CreateResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.request.ProductRequestMapper;
import java.io.IOException;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

  private final CreateProductApplication createProductApplication;
  private final GetProductApplication getProductApplication;
  private final ImageUploadApplication imageUploadApplication;
  private final ProductRequestMapper productRequestMapper;
  private final PutProductApplication putProductApplication;
  private final DeleteProductApplication deleteProductApplication;

  @GetMapping
  public ResponseEntity<List<Product>> getAllProducts() {
    return ResponseEntity.ok(getProductApplication.getAllProducts());
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) {
    return ResponseEntity.ok(getProductApplication.getProduct(id));
  }

  @PostMapping
  public ResponseEntity<CreateResponse> createProduct(
      @RequestPart("product") ProductRequest productRequest,
      @RequestPart("file") MultipartFile multipartFile) throws IOException {
    ImageUpload img = imageUploadApplication.imageUpload(multipartFile);
    String resource = img.getResource();
    productRequest.setImageUrl(resource);
    createProductApplication.createProduct(productRequestMapper.toEntity(productRequest));
    return new ResponseEntity<>(new CreateResponse("201", "Product was created successfully!!"),
        HttpStatus.CREATED);
  }


  @PutMapping(value = "/updateProduct")
  public void editProduct(@RequestBody Product product) {
    putProductApplication.updateProduct(product);
  }

  @Transactional
  @DeleteMapping(path = "{id}")
  public void deleteProduct(@PathVariable("id") Long id) {
    deleteProductApplication.deleteProduct(id);
  }

}