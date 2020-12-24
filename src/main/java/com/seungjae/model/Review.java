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
public class Review {
    @Id
    @Column
    int reviewId;

    @Column(length = 45)
    String userId;

    @Column
    int productId;

    @Column(length = 45)
    String date;

    @Column(length = 45)
    String content;

    @Column
    int score;

    @Builder
    public Review(int reviewId, String userId, int productId, String date, String content, int score) {
        this.reviewId = reviewId;
        this.userId = userId;
        this.productId = productId;
        this.date = date;
        this.content = content;
        this.score = score;
    }
}
