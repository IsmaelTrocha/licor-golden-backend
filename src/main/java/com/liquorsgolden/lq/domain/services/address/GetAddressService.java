package com.liquorsgolden.lq.domain.services.address;

import com.liquorsgolden.lq.domain.entities.Address;
import java.util.List;

public interface GetAddressService {

  List<Address> addressByCustomerIdIn(Long id);
}
