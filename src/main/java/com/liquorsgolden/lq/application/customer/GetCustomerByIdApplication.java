package com.liquorsgolden.lq.application.customer;

import com.liquorsgolden.lq.domain.entities.Customer;
import com.liquorsgolden.lq.domain.services.GetCustomerByIdService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetCustomerByIdApplication {

  private final GetCustomerByIdService getCustomerByIdService;

  public Customer getCustomerById(Long id) {
    return getCustomerByIdService.getCustomerById(id);
  }
}
