package com.liquorsgolden.lq.infrastructure.repository.user;

import com.liquorsgolden.lq.domain.entities.Address;
import com.liquorsgolden.lq.infrastructure.repository.address.AddressDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USERS")
@Entity
@Data
public class UserDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private int age;
  private String password;
  private Boolean enabled = false;
  @Column(name = "create_at")
  private LocalDateTime createAt;
  private String role;
}
