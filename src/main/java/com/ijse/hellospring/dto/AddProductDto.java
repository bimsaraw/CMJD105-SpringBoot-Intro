package com.ijse.hellospring.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddProductDto {
    private Long productId;
    private Integer quantity;
}
