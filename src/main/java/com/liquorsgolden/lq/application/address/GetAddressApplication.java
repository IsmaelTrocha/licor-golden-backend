package com.liquorsgolden.lq.application.address;

import com.liquorsgolden.lq.domain.entities.Address;
import com.liquorsgolden.lq.domain.services.address.GetAddressService;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor

public class GetAddressApplication {

  private final GetAddressService getAddressService;

  public List<Address> addressByCustomerIdIn(Long id) {
    return getAddressService.addressByCustomerIdIn(id);
  }
}
