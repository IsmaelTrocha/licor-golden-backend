package com.liquorsgolden.lq.infrastructure.adapter.address;

import com.liquorsgolden.lq.domain.entities.Address;
import com.liquorsgolden.lq.domain.services.address.GetAddressService;
import com.liquorsgolden.lq.infrastructure.repository.address.AddressDtoMapper;
import com.liquorsgolden.lq.infrastructure.repository.address.AddressRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetAddressAdapter implements GetAddressService {

  private final AddressRepository addressRepository;
  private final AddressDtoMapper addressDtoMapper;

  @Override
  public List<Address> addressByCustomerIdIn(Long id) {
    return addressDtoMapper.toEntity(addressRepository.addressByCustomerIdIn(id));
  }
}
