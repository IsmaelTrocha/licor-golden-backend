package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.CreateProductApplication;
import com.liquorsgolden.lq.application.product.DeleteProductByIdApplication;
import com.liquorsgolden.lq.application.product.GetAllProductApplication;
import com.liquorsgolden.lq.application.product.GetAllProductByCategoryIdApplication;
import com.liquorsgolden.lq.application.product.GetAllProductByProportionIdApplication;
import com.liquorsgolden.lq.application.product.GetMostSoldProductApplication;
import com.liquorsgolden.lq.application.product.GetProductByIdApplication;
import com.liquorsgolden.lq.application.product.ProductUpdateApplication;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.request.product.ProductRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.request.product.ProductUpdateRequest;
import com.liquorsgolden.lq.infrastructure.api.dto.response.ImageUploadResponse;
import com.liquorsgolden.lq.infrastructure.api.dto.response.product.ProductResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.image.ImageUploadResponseMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.product.request.ProductRequestMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.product.request.ProductUpdateRequestMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.product.response.ProductResponseMapper;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
  private final GetAllProductByCategoryIdApplication getAllProductByCategoryIdApplication;
  private final  GetMostSoldProductApplication getMostSoldProductApplication;
  private final GetAllProductByProportionIdApplication getAllProductByProportionIdApplication;

  @GetMapping("/getByProportion")
  public ResponseEntity<List<ProductResponse>> getByProportion(
          @RequestHeader Long proportionId) {
    return new ResponseEntity<>(productResponseMapper.toListDto(
            getAllProductByProportionIdApplication.getProductByProportion(proportionId)), HttpStatus.OK);

  }


  @GetMapping("/getByCategory")
  public ResponseEntity<List<ProductResponse>> getByCategory(
          @RequestHeader Long categoryId) {
    return new ResponseEntity<>(productResponseMapper.toListDto(
            getAllProductByCategoryIdApplication.getProductByCategory(categoryId)), HttpStatus.OK);
  }

  @GetMapping("/most-sold")
  public ResponseEntity<List<ProductResponse>> getBestSellingProducts() {
    return new ResponseEntity<>(productResponseMapper.toDto(getMostSoldProductApplication.getMostSoldProducts()), HttpStatus.OK);
    }


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