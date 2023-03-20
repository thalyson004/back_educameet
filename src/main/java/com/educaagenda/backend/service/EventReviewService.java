package com.educaagenda.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educaagenda.backend.dto.eventReview.EventReviewRequestDTO;
import com.educaagenda.backend.dto.eventReview.EventReviewResponseDTO;
import com.educaagenda.backend.model.EventReview;
import com.educaagenda.backend.repository.AcademicRepository;
import com.educaagenda.backend.repository.EventRepository;
import com.educaagenda.backend.repository.EventReviewRepository;

import jakarta.transaction.Transactional;

@Service
public class EventReviewService {

    @Autowired
    EventRepository eventRepository;

    @Autowired
    AcademicRepository academicRepository;

    @Autowired
    EventReviewRepository eventReviewRepository;

    public ResponseEntity<Object> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(
            eventReviewRepository.findAll().stream().map((eventReview) -> new EventReviewResponseDTO(eventReview)).toList());
    }

    @Transactional
    public EventReviewRequestDTO salvar (EventReviewRequestDTO eventReviewRequestDTO) {        

        EventReview eventReview = new EventReview();
        
        eventReviewRepository.save(eventReview);
        return eventReviewRequestDTO;
        
    }  

      //find by event_id
    //salvar

}
