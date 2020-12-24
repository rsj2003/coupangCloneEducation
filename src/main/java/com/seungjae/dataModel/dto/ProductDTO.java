package com.seungjae.dataModel.dto;

import com.seungjae.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {
    int productId;
    String name;
    int price;
    int stock;
    String category;
    int delivery;
    String sellerId;
    int inCoupon = 0;

    public ProductDTO(Product product) {
        this.productId = product.getProductId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.stock = product.getStock();
        this.category = product.getCategory();
        this.delivery = product.getDelivery();
        this.sellerId = product.getSellerId();
    }
}
