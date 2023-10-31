package com.liquorsgolden.lq.infrastructure.api.mapper.customer;

import com.liquorsgolden.lq.domain.entities.Customer;
import com.liquorsgolden.lq.infrastructure.api.dto.request.customer.CustomerRequest;
import com.liquorsgolden.lq.shared.mapper.EntityToDto;

public interface CustomerRequestMapper extends EntityToDto<Customer, CustomerRequest> {

}
