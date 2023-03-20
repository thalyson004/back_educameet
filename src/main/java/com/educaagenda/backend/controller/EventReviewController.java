package com.educaagenda.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educaagenda.backend.dto.eventReview.EventReviewRequestDTO;
import com.educaagenda.backend.service.EventReviewService;

@RestController
@RequestMapping("/reviews")
public class EventReviewController {

    @Autowired
    EventReviewService eventReviewService;

    @GetMapping
    public ResponseEntity<Object> findAll() {
        return eventReviewService.findAll();
    }     

    @PostMapping
    public EventReviewRequestDTO save(@RequestBody EventReviewRequestDTO eventReviewRequestDTO) {
        return eventReviewService.salvar(eventReviewRequestDTO);
    }

}
