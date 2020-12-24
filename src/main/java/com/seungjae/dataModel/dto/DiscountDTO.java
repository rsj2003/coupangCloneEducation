package com.seungjae.dataModel.dto;

import com.seungjae.model.Discount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DiscountDTO {
    int discountId;
    int productId;
    int rate;
    int reduced;
    String period;

    public DiscountDTO(Discount discount) {
        this.discountId = discount.getDiscountId();
        this.productId = discount.getProductId();
        this.rate = discount.getRate();
        this.reduced = discount.getReduced();
        this. period = discount.getPeriod();
    }
}
