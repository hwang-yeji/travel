package com.example.travel.dto.admin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductOptionRequest {

    private long productOptionId;
    private String productOptionAgeRange;
    private int productOptionRegularPrice;
    private Integer productOptionDiscountPrice;
}
