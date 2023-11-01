package com.liquorsgolden.lq.infrastructure.api.dto.request.order;

import com.liquorsgolden.lq.domain.entities.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class OrderRequest {

    @Schema(name = "userId",
            description = "Solo se aceptan numeros que esten en BD, campo obligatorio",
            example = "1",
            type = "Number"
    )
    @NotNull(message = "El userId no puede ser nulo")
    private Long userId;

    @Schema(name = "addressId",
            description = "Solo se aceptan numeros que esten en BD, campo obligatorio",
            example = "1",
            type = "Number"
    )
    @NotNull(message = "El addressId no puede ser nulo")
    private Long addressId;

    @Schema(name = "statusId",
            description = "Solo se aceptan numeros que esten en BD, campo obligatorio",
            example = "1",
            type = "Number"
    )
    @NotNull(message = "El status no puede ser nulo")
    private Long statusId;

    @Schema(name = "products",
            description = "Lista de IDs de productos a comprar",
            example = "[1, 2, 3]",
            type = "array"

    )
    @NotNull(message = "El userId no puede ser nulo")
    private List<Long> products;

    @Schema(name = "quantity",
            description = "Cantidad de productos en la orden",
            example = "3",
            type = "integer"
    )
    private int quantity;


    public void setTotal(double total) {

    }

    public void setCreationOrder(LocalDateTime now) {

    }
}
