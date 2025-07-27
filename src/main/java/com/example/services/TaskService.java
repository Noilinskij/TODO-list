package com.example.services;

import com.example.model.dto.PostTask;
import com.example.model.dto.PostTaskResponse;
import com.example.model.entity.TaskEntity;
import com.example.repository.TaskRepository;
import org.springframework.stereotype.Service;
import com.example.mapper.Taskmapper;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final Taskmapper taskmapper;

    public TaskService(TaskRepository taskRepository, Taskmapper taskmapper) {
        this.taskRepository = taskRepository;
        this.taskmapper = taskmapper;
    }

    public PostTaskResponse createTask(PostTask request) {
        TaskEntity taskEntity = taskmapper.dtoToEntity(request);
        TaskEntity savedTaskEntity = taskRepository.save(taskEntity);

        return taskmapper.entityToDto(savedTaskEntity);
    }
}
