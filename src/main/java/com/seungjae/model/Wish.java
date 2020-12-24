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
public class Wish {
    @Id
    @Column
    int wishId;

    @Column(length = 45)
    String userId;

    @Column
    int productId;

    @Builder
    public Wish(int wishId, String userId, int productId) {
        this.wishId = wishId;
        this.userId = userId;
        this.productId = productId;
    }
}
