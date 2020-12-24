package com.seungjae.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class Product {
    @Id
    @Column
    int productId;

    @Column(length = 45)
    String name;

    @Column
    int price;

    @Column
    int stock;

    @Column(length = 45)
    String category;

    @Column
    int delivery;

    @Column(length = 45)
    String sellerId;

    @Column
    int inCoupon = 0;

    @Builder
    public Product(int productId, String name, int price, int stock, String category, int delivery, String sellerId) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.delivery = delivery;
        this.sellerId = sellerId;
    }

}
