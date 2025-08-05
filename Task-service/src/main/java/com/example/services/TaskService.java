package com.example.services;

import com.example.model.dto.PostTask;
import com.example.model.dto.TaskResponse;
import com.example.model.dto.UpdateTask;

import java.util.List;

public interface TaskService {
    public TaskResponse createTask(PostTask request);
    public TaskResponse getTask(Long id);
    public List<TaskResponse> getTaskAll();
    public TaskResponse updateTask(Long id, UpdateTask request);
    public void deleteTask(Long id);
}
