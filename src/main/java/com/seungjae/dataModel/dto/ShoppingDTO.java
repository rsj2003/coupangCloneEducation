package com.seungjae.dataModel.dto;

import com.seungjae.model.Shopping;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ShoppingDTO {
    int shoppingId;
    String userId;
    int productId;
    int count;

    public ShoppingDTO(Shopping shopping) {
        this.shoppingId = shopping.getShoppingId();
        this.userId = shopping.getUserId();
        this.productId = shopping.getProductId();
        this.count = shopping.getCount();
    }
}
