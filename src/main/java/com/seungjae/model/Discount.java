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
public class Discount {
    @Id
    @Column
    int discountId;

    @Column
    int productId;

    @Column
    int rate;

    @Column
    int reduced;

    @Column(length = 45)
    String period;

    @Builder
    public Discount(int discountId, int productId, int rate, int reduced, String period) {
        this.discountId = discountId;
        this.productId = productId;
        this.rate = rate;
        this.reduced = reduced;
        this. period = period;
    }
}
