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
public class User {
    @Id
    @Column(length = 45)
    String userId;

    @Column(length = 45)
    String name;

    @Column(length = 45)
    String email;

    @Column(length = 45)
    String pass;

    @Column(length = 45)
    String phone;

    @Column
    int grade = 0;

    @Column(length = 45)
    String address;

    @Column
    int point = 0;

    @Builder
    public User(String userId, String name, String email, String pass, String phone, String address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.address = address;
    }
}
