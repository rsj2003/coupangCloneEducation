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
public class Seller {
    @Id
    @Column(length = 45)
    String sellerId;

    @Column(length = 45)
    String name;

    @Column(length = 45)
    String email;

    @Column(length = 45)
    String phone;

    @Builder
    public Seller(String sellerId, String name, String email, String phone) {
        this.sellerId = sellerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
