package com.liquorsgolden.lq.domain.services;

import com.liquorsgolden.lq.domain.entities.Customer;

public interface GetCustomerByIdService {

  Customer getCustomerById(Long customerId);
}
