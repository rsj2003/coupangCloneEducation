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
public class Shopping {
    @Id
    @Column
    int shoppingId;

    @Column(length = 45)
    String userId;

    @Column
    int productId;

    @Column
    int count;

    @Builder
    public Shopping(int shoppingId, String userId, int productId, int count) {
        this.shoppingId = shoppingId;
        this.userId = userId;
        this.productId = productId;
        this.count = count;
    }
}
