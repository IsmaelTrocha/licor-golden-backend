package com.liquorsgolden.lq.domain.entities;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Customer {

  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private int age;
  private Address address;
  private String password;
  private Boolean enabled = false;
  private LocalDateTime create_at;
  private String role;

}
