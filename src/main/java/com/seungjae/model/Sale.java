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
public class Sale {
    @Id
    @Column
    int saleId;

    @Column(length = 45)
    String userId;

    @Column
    int productId;

    @Column(length = 45)
    String date;

    @Column
    int count;

    @Builder
    public Sale(int saleId, String userId, int productId, String date, int count) {
        this.saleId = saleId;
        this.userId = userId;
        this.productId = productId;
        this.date = date;
        this.count = count;
    }
}
