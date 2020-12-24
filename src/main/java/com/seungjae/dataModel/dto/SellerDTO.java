package com.seungjae.dataModel.dto;

import com.seungjae.model.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SellerDTO {
    String sellerId;
    String name;
    String email;
    String phone;

    public SellerDTO(Seller seller) {
        this.sellerId = seller.getSellerId();
        this.name = seller.getName();
        this.email = seller.getEmail();
        this.phone = seller.getPhone();
    }
}
