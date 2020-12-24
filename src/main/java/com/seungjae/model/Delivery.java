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
public class Delivery {
    @Id
    @Column
    int deliveryId;

    @Column(length = 45)
    String userId;

    @Column
    int saleId;

    @Column(length = 45)
    String period;

    @Builder
    public Delivery(int deliveryId, String userId, int saleId, String period) {
        this.deliveryId = deliveryId;
        this.userId = userId;
        this.saleId = saleId;
        this.period = period;
    }
}
