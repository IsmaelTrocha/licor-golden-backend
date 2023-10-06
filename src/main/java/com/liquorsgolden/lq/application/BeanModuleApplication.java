package com.liquorsgolden.lq.application;

import com.liquorsgolden.lq.application.category.CreateCategoryApplication;
import com.liquorsgolden.lq.application.category.GetCategoryApplication;
import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.CreateProductApplication;
import com.liquorsgolden.lq.application.product.DeleteProductApplication;
import com.liquorsgolden.lq.application.product.GetProductApplication;
import com.liquorsgolden.lq.application.product.PutProductApplication;
import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import com.liquorsgolden.lq.domain.services.category.GetCategoryService;
import com.liquorsgolden.lq.domain.services.image.ImageUploadService;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import com.liquorsgolden.lq.domain.services.product.DeleteProductService;
import com.liquorsgolden.lq.domain.services.product.GetProductService;
import com.liquorsgolden.lq.domain.services.product.PutProductService;
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
  public CreateProductApplication createProductApplication(
      ProductProcess productProcess,
      CreateProductService createProductService) {
    return new CreateProductApplication(productProcess, createProductService);
  }

  @Bean
  public GetProductApplication getProductApplication(
      GetProductService getProductService) {
    return new GetProductApplication(getProductService);
  }

  @Bean
  public PutProductApplication putProductApplication(
      PutProductService putProductService) {
    return new PutProductApplication(putProductService);
  }

  @Bean
  DeleteProductApplication deleteProductApplication(
      DeleteProductService deleteProductService) {
    return new DeleteProductApplication(deleteProductService);
  }

  @Bean
  public ImageUploadApplication imageUploadApplication(
      ImageUploadService imageUploadService) {
    return new ImageUploadApplication(imageUploadService);
  }

}

