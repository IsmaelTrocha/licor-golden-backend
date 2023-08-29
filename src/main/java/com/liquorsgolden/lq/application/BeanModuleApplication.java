package com.liquorsgolden.lq.application;

import com.liquorsgolden.lq.application.category.CreateCategoryApplication;
import com.liquorsgolden.lq.application.category.GetCategoryApplication;
import com.liquorsgolden.lq.application.category.process.CategoryProcess;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import com.liquorsgolden.lq.domain.services.category.GetCategoryService;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {


  @Bean
  public CategoryProcess categoryProcess(MessageUtils messageUtils,
      GetCategoryService getCategoryService,
      CreateCategoryService createCategoryService) {
    return new CategoryProcess(messageUtils, getCategoryService, createCategoryService);
  }

  @Bean
  public CreateCategoryApplication categoryApplication(
      CreateCategoryService categoryProcess) {
    return new CreateCategoryApplication(categoryProcess);
  }

  @Bean
  public GetCategoryApplication getCategoryApplication(
      CategoryProcess categoryProcess) {
    return new GetCategoryApplication(categoryProcess);
  }
}

