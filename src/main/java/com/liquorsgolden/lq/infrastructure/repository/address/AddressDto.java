package com.liquorsgolden.lq.infrastructure.repository.address;

import com.liquorsgolden.lq.infrastructure.repository.city.CityDto;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ADDRESSES")
public class AddressDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String street;
  private String avenue;
  private String description;
  @ManyToOne
  @JoinColumn(name = "city_id")
  private CityDto city;
  @Column(name = "postal_code")
  private String postalCode;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private CustomerDto user;

}
