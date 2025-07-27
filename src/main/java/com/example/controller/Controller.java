package com.example.controller;

import com.example.model.dto.PostTask;
import com.example.model.dto.PostTaskResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class Controller {

    private final TaskService taskService;

    Controller(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<PostTaskResponse> createTask(@Validated @RequestBody PostTask request) {
        PostTaskResponse response = taskService.createTask(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
