package com.liquorsgolden.lq.infrastructure.api.dto.response;

import com.liquorsgolden.lq.infrastructure.api.dto.response.address.AddressResponse;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CustomerResponse {

  private Long id;
  private String firstName;
  private String email;
  private List<AddressResponse> address;

}
