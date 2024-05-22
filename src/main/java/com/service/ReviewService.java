package com.service;

import com.model.Review;

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    Review createReview(Review reviewModel);
    List<Review> getAllReviewByUserId(Integer userId);

    List<Review> getReviewByWorkerId(Integer workerId);
}
