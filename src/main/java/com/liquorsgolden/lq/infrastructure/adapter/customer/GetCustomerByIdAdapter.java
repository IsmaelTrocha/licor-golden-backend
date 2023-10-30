package com.liquorsgolden.lq.infrastructure.adapter.customer;

import com.liquorsgolden.lq.domain.entities.Customer;
import com.liquorsgolden.lq.domain.services.GetCustomerByIdService;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GetCustomerByIdAdapter implements GetCustomerByIdService {

  private final CustomerRepository customerRepository;
  private final CustomerDtoMapper customerDtoMapper;

  @Override
  public Customer getCustomerById(Long customerId) {
    return customerDtoMapper.toEntity(customerRepository.findById(customerId)
        .orElseThrow(() -> new RuntimeException("Customer not found")));
  }
}
