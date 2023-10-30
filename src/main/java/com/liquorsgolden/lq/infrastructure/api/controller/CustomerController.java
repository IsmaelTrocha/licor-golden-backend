package com.liquorsgolden.lq.infrastructure.api.controller;

import com.liquorsgolden.lq.application.address.GetAddressApplication;
import com.liquorsgolden.lq.application.customer.GetCustomerByIdApplication;
import com.liquorsgolden.lq.infrastructure.api.dto.response.CustomerResponse;
import com.liquorsgolden.lq.infrastructure.api.mapper.address.AddressResponseMapper;
import com.liquorsgolden.lq.infrastructure.api.mapper.customer.CustomerResponseMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/customers")
@AllArgsConstructor
public class CustomerController {

  private final GetCustomerByIdApplication getCustomerByIdApplication;
  private final CustomerResponseMapper customerResponseMapper;
  private final GetAddressApplication getAddressApplication;
  private final AddressResponseMapper addressResponseMapper;

  @GetMapping(path = "/{id}")
  public ResponseEntity<CustomerResponse> findCustomerById(@PathVariable("id") Long id) {
    CustomerResponse response = customerResponseMapper.toDto(
        getCustomerByIdApplication.getCustomerById(id));
    response.setAddress(
        addressResponseMapper.toDto(getAddressApplication.addressByCustomerIdIn(id)));
    return new ResponseEntity<>(response, HttpStatus.OK);

  }
}
