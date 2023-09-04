package com.liquorsgolden.lq.application;

import com.liquorsgolden.lq.application.category.CreateCategoryApplication;
import com.liquorsgolden.lq.application.category.GetCategoryApplication;
import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.CreateProductApplication;
import com.liquorsgolden.lq.application.product.GetProductApplication;
import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import com.liquorsgolden.lq.domain.services.category.GetCategoryService;
import com.liquorsgolden.lq.domain.services.image.ImageUploadService;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import com.liquorsgolden.lq.domain.services.product.GetProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {


  @Bean
  public CreateCategoryApplication categoryApplication(
      CreateCategoryService createCategoryService) {
    return new CreateCategoryApplication(createCategoryService);
  }

  @Bean
  public GetCategoryApplication getCategoryApplication(GetCategoryService getCategoryService) {
    return new GetCategoryApplication(getCategoryService);
  }

  @Bean
  public GetProductApplication getProductApplication(
      GetProductService productService) {
    return new GetProductApplication(productService);
  }

  @Bean
  public CreateProductApplication createProductApplication(
      ProductProcess productProcess,
      CreateProductService createProductService) {
    return new CreateProductApplication(productProcess, createProductService);
  }

  @Bean
  public ImageUploadApplication imageUploadApplication(
      ImageUploadService imageUploadService) {
    return new ImageUploadApplication(imageUploadService);
  }

}

