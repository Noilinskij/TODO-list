package com.example.services;

import com.example.model.dto.PostTask;
import com.example.model.dto.PostTaskResponse;
import com.example.model.entity.Task;
import com.example.repository.TaskRepository;
import org.springframework.stereotype.Service;
import com.example.mapper.Mapper;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final Mapper mapper;

    public TaskService(TaskRepository taskRepository, Mapper mapper) {
        this.taskRepository = taskRepository;
        this.mapper = mapper;
    }

    public PostTaskResponse createTask(PostTask request) {
        Task task = mapper.DtoToEntity(request);
        Task savedTask = taskRepository.save(task);

        return mapper.EntityToDto(savedTask);
    }
}
