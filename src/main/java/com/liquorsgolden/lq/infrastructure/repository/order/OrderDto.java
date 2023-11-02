package com.liquorsgolden.lq.infrastructure.repository.order;

import com.liquorsgolden.lq.infrastructure.repository.address.AddressDto;
import com.liquorsgolden.lq.infrastructure.repository.product.ProductDto;
import com.liquorsgolden.lq.infrastructure.repository.status.StatusDto;
import com.liquorsgolden.lq.infrastructure.repository.user.CustomerDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDERS")
@Entity
@Data
public class OrderDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private CustomerDto user;

  @ManyToMany // Cambia a @ManyToMany para tener una lista de productos
  @JoinTable(
      name = "order_products",
      joinColumns = @JoinColumn(name = "order_id"),
      inverseJoinColumns = @JoinColumn(name = "product_id")
  )
  private List<ProductDto> products; // Cambia a una lista de ProductDto

  @ManyToOne
  @JoinColumn(name = "product_id")
  private ProductDto product;
  @Column(name = "creation_order")
  private LocalDateTime creationOrder;

  @Column(name = "finish_date")
  private LocalDateTime finishDate;

  @Column(name = "delivery_date")
  private LocalDateTime deliveryDate;

  @Column(name = "quantity")
  private int quantity;

  @Column(name = "total_price")
  private Double total;

  @ManyToOne
  @JoinColumn(name = "address_id")
  private AddressDto address;

  @ManyToOne
  @JoinColumn(name = "status_id")
  private StatusDto status;
}
