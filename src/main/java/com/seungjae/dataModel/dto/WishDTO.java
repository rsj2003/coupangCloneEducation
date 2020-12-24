package com.seungjae.dataModel.dto;

import com.seungjae.model.Wish;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class WishDTO {
    int wishId;
    String userId;
    int productId;

    public WishDTO(Wish wish) {
        this.wishId = wish.getWishId();
        this.userId = wish.getUserId();
        this.productId = wish.getProductId();
    }
}
