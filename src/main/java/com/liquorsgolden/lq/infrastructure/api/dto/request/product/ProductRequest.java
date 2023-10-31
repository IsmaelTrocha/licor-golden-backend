package com.liquorsgolden.lq.infrastructure.api.dto.request.product;

import com.liquorsgolden.lq.domain.entities.Proportion;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductRequest {


  @Schema(name = "categoryId",
          description = "Solo se aceptan numeros que esten en BD, campo obligatorio",
          example = "1",
          type = "Number"
  )
  @NotNull(message = "La Categoria no puede ser nulo")
  private Long categoryId;

  @Schema(name = "statusId",
          description = "Solo se aceptan numeros que esten en BD, campo obligatorio",
          example = "1",
          type = "Number"
  )
  @NotNull(message = "El status no puede ser nulo")
  private Long statusId;


  @Schema(name = "proportionId",
          description = "Solo se aceptan numeros que esten en BD, campo obligatorio",
          example = "1",
          type = "Number"
  )
  @NotNull(message = "La proporcion no puede ser nulo")
  private Long proportionId;

  @Schema(name = "nameProduct",
          description = "Nombre del producto",
          accessMode = Schema.AccessMode.READ_WRITE,
          example = "Costeñita",
          type = "String"
  )
  @NotBlank(message = "El nombre del producto no puede ser nulo")
  @Size(max = 60, message = "el nombre del producto debe tener maximo {60} caracteres.")
  private String nameProduct;

  @Schema(name = "description",
          description = "Descripcion del producto",
          accessMode = Schema.AccessMode.READ_WRITE,
          example = "Cerveza muy refrescante",
          type = "String"
  )
  @NotBlank(message = "La description del producto no puede ser nulo")
  @Size(max = 200, message = "La description del producto debe tener maximo {200} caracteres.")
  private String description;


  @Schema( name = "imageUrl",
          description = "la imageUrl debe venir del front. Este campo es obligatorio.",
          accessMode = Schema.AccessMode.READ_WRITE
  )
  @NotBlank(message = "La URL del imageUrl es obligatorio, debe pesar max 5mb.")
  private String imageUrl;

  @Schema(name = "price",
          description = "Precio del producto",
          accessMode = Schema.AccessMode.READ_WRITE,
          example = "10.99",
          type = "Number"
  )
  @NotNull(message = "El precio del producto no puede ser nulo")
  @Positive(message = "El precio del producto debe ser un número positivo")
  private Double price;

  @Schema(name = "stock",
          description = "Cantidad en stock del producto",
          accessMode = Schema.AccessMode.READ_WRITE,
          example = "100",
          type = "Integer"
  )
  @NotNull(message = "El stock del producto no puede ser nulo")
  @Positive(message = "El stock del producto debe ser un número positivo")
  private int stock;


}
