package com.liquorsgolden.lq.application;

import com.liquorsgolden.lq.application.category.GetAllCategoryApplication;
import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.*;
import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.application.status.GetAllStatusApplication;
import com.liquorsgolden.lq.domain.services.category.GetAllCategoryService;
import com.liquorsgolden.lq.domain.services.image.ImageUploadService;
import com.liquorsgolden.lq.domain.services.product.*;
import com.liquorsgolden.lq.domain.services.status.GetAllStatusService;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {

  @Bean
  public ProductProcess productProcess(
      MessageUtils messageUtils) {
    return new ProductProcess(messageUtils);
  }

  @Bean
  public GetAllCategoryApplication getAllCategoryApplication(
      GetAllCategoryService getAllCategoryService) {
    return new GetAllCategoryApplication(getAllCategoryService);
  }

  @Bean
  public ImageUploadApplication getImageUploadApplication(ImageUploadService uploadService) {
    return new ImageUploadApplication(uploadService);
  }

  @Bean
  public CreateProductApplication createProductApplication(
      ProductProcess productProcess,
      CreateProductService createProductService) {
    return new CreateProductApplication(productProcess, createProductService);
  }

  @Bean
  public DeleteProductByIdApplication deleteProductByIdApplication(
      DeleteProductByIdService deleteProductByIdService) {
    return new DeleteProductByIdApplication(deleteProductByIdService);
  }
  @Bean
  public GetMostSoldProductApplication getMostSoldProductApplication(
      GetMostSoldProductService getMostSoldProductService){
    return new GetMostSoldProductApplication(getMostSoldProductService);
  }
  @Bean
  public GetAllProductApplication getAllProductById(
      GetAllProductService getAllProductService) {
    return new GetAllProductApplication(getAllProductService);
  }

  @Bean
  public GetProductByIdApplication getProductById(
      GetProductByIdService getProductByIdService) {
    return new GetProductByIdApplication(getProductByIdService);
  }

  @Bean
  public ProductUpdateApplication productUpdateService(
      ProductUpdateService productUpdateService) {
    return new ProductUpdateApplication(productUpdateService);
  }

  @Bean
  public GetAllStatusApplication getAllStatusApplication(
      GetAllStatusService getAllStatusService){
    return new GetAllStatusApplication(getAllStatusService);
  }

  @Bean
  public GetAllProductByCategoryIdApplication getAllProductByCategoryIdApplication(GetAllProductByCategoryIdService getAllProductByCategoryIdService) {
    return new GetAllProductByCategoryIdApplication(getAllProductByCategoryIdService);
  }
}
