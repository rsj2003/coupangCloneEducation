package com.seungjae.dataModel.dto;

import com.seungjae.model.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ReviewDTO {
    int reviewId;
    String userId;
    int productId;
    String date;
    String content;
    int score;

    public ReviewDTO(Review review) {
        this.reviewId = review.getReviewId();
        this.userId = review.getUserId();
        this.productId = review.getProductId();
        this.date = review.getDate();
        this.content = review.getContent();
        this.score = review.getScore();
    }
}
