package com.educaagenda.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educaagenda.backend.model.EventReview;

@Repository
public interface EventReviewRepository extends JpaRepository<EventReview, Long>{
    
}
