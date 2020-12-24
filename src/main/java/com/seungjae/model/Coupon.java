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
public class Coupon {
    @Id
    @Column
    int couponId;

    @Column(length = 45)
    String userId;

    @Column
    int rate;

    @Column
    int reduced;

    @Column(length = 45)
    String period;

    @Column
    int num;

    @Column
    int use = 0;

    @Builder
    public Coupon(int couponId, String userId, int rate, int reduced, String period, int num) {
        this.couponId = couponId;
        this.userId = userId;
        this.rate = rate;
        this.reduced = reduced;
        this.period = period;
        this.num = num;
    }
}
