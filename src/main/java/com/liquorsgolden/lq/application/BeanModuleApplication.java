package com.liquorsgolden.lq.application;

import com.liquorsgolden.lq.application.category.CreateCategoryApplication;
import com.liquorsgolden.lq.domain.services.category.CreateCategoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {

    @Bean
    public CreateCategoryApplication categoryApplication(
            CreateCategoryService createCategoryService) {
        return new CreateCategoryApplication(createCategoryService);
    }
}
