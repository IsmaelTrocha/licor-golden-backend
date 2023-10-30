package com.liquorsgolden.lq.application;

import com.liquorsgolden.lq.application.address.GetAddressApplication;
import com.liquorsgolden.lq.application.cart.AddShoppingCartApplication;
import com.liquorsgolden.lq.application.cart.GetShoppingCartByIdApplication;
import com.liquorsgolden.lq.application.cartitem.AddCartItemApplication;
import com.liquorsgolden.lq.application.category.GetAllCategoryApplication;
import com.liquorsgolden.lq.application.customer.GetCustomerByIdApplication;
import com.liquorsgolden.lq.application.image.ImageUploadApplication;
import com.liquorsgolden.lq.application.product.CreateProductApplication;
import com.liquorsgolden.lq.application.product.DeleteProductByIdApplication;
import com.liquorsgolden.lq.application.product.GetAllProductApplication;
import com.liquorsgolden.lq.application.product.GetAllProductByCategoryIdApplication;
import com.liquorsgolden.lq.application.product.GetAllProductByProportionIdApplication;
import com.liquorsgolden.lq.application.product.GetProductByIdApplication;
import com.liquorsgolden.lq.application.product.ProductUpdateApplication;
import com.liquorsgolden.lq.application.product.UpdateStockProductApplication;
import com.liquorsgolden.lq.application.product.process.ProductProcess;
import com.liquorsgolden.lq.application.proportion.GetAllProportionApplication;
import com.liquorsgolden.lq.application.status.GetAllStatusApplication;
import com.liquorsgolden.lq.domain.services.GetCustomerByIdService;
import com.liquorsgolden.lq.domain.services.address.GetAddressService;
import com.liquorsgolden.lq.domain.services.cart.AddShoppingCartService;
import com.liquorsgolden.lq.domain.services.cart.GetShoppingCartByIdService;
import com.liquorsgolden.lq.domain.services.cartitem.AddCartItemService;
import com.liquorsgolden.lq.domain.services.category.GetAllCategoryService;
import com.liquorsgolden.lq.domain.services.image.ImageUploadService;
import com.liquorsgolden.lq.domain.services.product.CreateProductService;
import com.liquorsgolden.lq.domain.services.product.DeleteProductByIdService;
import com.liquorsgolden.lq.domain.services.product.GetAllProductByCategoryIdService;
import com.liquorsgolden.lq.domain.services.product.GetAllProductByProportionIdService;
import com.liquorsgolden.lq.domain.services.product.GetAllProductService;
import com.liquorsgolden.lq.domain.services.product.GetProductByIdService;
import com.liquorsgolden.lq.domain.services.product.ProductUpdateService;
import com.liquorsgolden.lq.domain.services.product.UpdateStockProductService;
import com.liquorsgolden.lq.domain.services.proportion.GetAllProportionService;
import com.liquorsgolden.lq.domain.services.status.GetAllStatusService;
import com.liquorsgolden.lq.shared.utils.MessageUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {

  @Bean
  public GetAllProportionApplication getAllProportionApplication(
      GetAllProportionService getAllProportionService) {
    return new GetAllProportionApplication(getAllProportionService);
  }

  @Bean
  public GetAllProductByProportionIdApplication getAllProductByProportionIdApplication(
      GetAllProductByProportionIdService getAllProductByProportionIdService) {
    return new GetAllProductByProportionIdApplication(getAllProductByProportionIdService);
  }

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
      GetProductByIdApplication getProductByIdApplication,
      CreateProductService createProductService,
      UpdateStockProductApplication updateStockProductApplication) {
    return new CreateProductApplication(
        productProcess,
        getProductByIdApplication,
        createProductService,
        updateStockProductApplication);
  }

  @Bean
  public DeleteProductByIdApplication deleteProductByIdApplication(
      DeleteProductByIdService deleteProductByIdService) {
    return new DeleteProductByIdApplication(deleteProductByIdService);
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
      GetAllStatusService getAllStatusService) {
    return new GetAllStatusApplication(getAllStatusService);
  }

  @Bean
  public GetAllProductByCategoryIdApplication getAllProductByCategoryIdApplication(
      GetAllProductByCategoryIdService getAllProductByCategoryIdService) {
    return new GetAllProductByCategoryIdApplication(getAllProductByCategoryIdService);
  }



  @Bean
  public UpdateStockProductApplication updateStockProductApplication(
      UpdateStockProductService updateStockProductService) {
    return new UpdateStockProductApplication(updateStockProductService);
  }

  @Bean
  public AddShoppingCartApplication addItemShoppingCartApplication(
      AddShoppingCartService addShoppingCartService,
      GetCustomerByIdApplication getCustomerByIdApplication) {
    return new AddShoppingCartApplication(
        addShoppingCartService,
        getCustomerByIdApplication);
  }

  @Bean
  public AddCartItemApplication addCartItemApplication(
      AddCartItemService addCartItemService,
      GetShoppingCartByIdApplication cartByIdApplication,
      GetProductByIdApplication getProductByIdApplication) {
    return new AddCartItemApplication(
        addCartItemService,
        cartByIdApplication,
        getProductByIdApplication);
  }

  @Bean
  public GetShoppingCartByIdApplication cartByIdApplication(
      GetShoppingCartByIdService getShoppingCartByIdService) {
    return new GetShoppingCartByIdApplication(getShoppingCartByIdService);
  }

  @Bean
  public GetCustomerByIdApplication getCustomerByIdApplication(
      GetCustomerByIdService getCustomerByIdService) {
    return new GetCustomerByIdApplication(getCustomerByIdService);
  }

  @Bean
  public GetAddressApplication getAddressApplication(
      GetAddressService getAddressService) {
    return new GetAddressApplication(getAddressService);
  }
}