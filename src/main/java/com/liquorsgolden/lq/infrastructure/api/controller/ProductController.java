package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.product.CreateProductApplication;
import com.liquorsgolden.lq.application.product.GetProductApplication;
import com.liquorsgolden.lq.domain.entities.Product;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CreateResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/product")
@CrossOrigin(origins = "*")
public class ProductController {

  private final CreateProductApplication createProductApplication;
  private final GetProductApplication getProductApplication;

  @PostMapping
  public ResponseEntity<CreateResponse> addProduct(@RequestBody Product product) {
    createProductApplication.createProduct(product);
    return new ResponseEntity<>(new CreateResponse("201", "Product created successful"),
        HttpStatus.CREATED);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) {
    return new ResponseEntity<>(getProductApplication.findById(id), HttpStatus.OK);

  }
}
