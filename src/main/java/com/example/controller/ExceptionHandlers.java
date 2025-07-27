package com.example.controller;

import com.example.exception.NotFoundException;
import com.example.model.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDto> notFoundHandler(NotFoundException exception) {
        ExceptionDto error = new ExceptionDto("Задача не найдена");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
