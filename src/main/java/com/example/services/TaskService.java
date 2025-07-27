package com.example.services;

import com.example.model.dto.PostTask;
import com.example.model.dto.TaskResponse;

public interface TaskService {
    public TaskResponse createTask(PostTask request);
    public TaskResponse getTask(Long id);
}
