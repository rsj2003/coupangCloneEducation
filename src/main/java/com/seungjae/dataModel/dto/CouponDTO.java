package com.seungjae.dataModel.dto;

import com.seungjae.model.Coupon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CouponDTO {
    int couponId;
    String userId;
    int rate;
    int reduced;
    String period;
    int num;
    int use = 0;

    public CouponDTO(Coupon coupon) {
        this.couponId = coupon.getCouponId();
        this.userId = coupon.getUserId();
        this.rate = coupon.getRate();
        this.reduced = coupon.getReduced();
        this.period = coupon.getPeriod();
        this.num = coupon.getNum();
        this.use = coupon.getUse();
    }
}
