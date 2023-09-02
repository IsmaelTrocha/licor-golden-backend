package com.liquorsgolden.lq.application;

import com.liquorsgolden.lq.application.category.CreateCategoryApplication;
import com.liquorsgolden.lq.application.category.GetCategoryApplication;
import com.liquorsgolden.lq.application.product.GetProductApplication;
import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import com.liquorsgolden.lq.domain.services.category.GetCategoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {

  @Bean
  public CreateCategoryApplication categoryApplication(
      CreateCategoryService categoryProcess) {
    return new CreateCategoryApplication(categoryProcess);
  }

  @Bean
  public GetCategoryApplication getCategoryApplication(GetCategoryService getCategoryService) {
    return new GetCategoryApplication(getCategoryService);
  }

  @Bean
  public GetProductApplication getProductApplication(
      ProductProcess productProcess) {
    return new GetProductApplication(productProcess);
  }
}

