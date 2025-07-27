package com.example.controller;

import com.example.exception.NotFoundException;
import com.example.model.dto.PostTask;
import com.example.services.TaskService;
import com.example.model.dto.TaskResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class Controller {

    private final TaskService taskService;

    Controller(TaskService taskServiceImpl) {
        this.taskService = taskServiceImpl;
    }

    @PostMapping
    public ResponseEntity<TaskResponse> createTask(@Validated @RequestBody PostTask request) {
        TaskResponse response = taskService.createTask(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> getTask(@PathVariable Long id) {
        TaskResponse response = taskService.getTask(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }
    @GetMapping
    public ResponseEntity<List<TaskResponse>> getTaskAll() {
        List<TaskResponse> tasks = taskService.getTaskAll();
        return ResponseEntity.status(HttpStatus.OK).body(tasks);
    }
}
