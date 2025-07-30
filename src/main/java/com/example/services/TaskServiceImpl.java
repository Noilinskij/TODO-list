package com.example.services;

import com.example.exception.NotFoundException;
import com.example.model.dto.PostTask;
import com.example.model.dto.TaskResponse;
import com.example.model.dto.UpdateTask;
import com.example.model.entity.TaskEntity;
import com.example.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.example.mapper.Taskmapper;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final Taskmapper taskmapper;

    public TaskServiceImpl(TaskRepository taskRepository, Taskmapper taskmapper) {
        this.taskRepository = taskRepository;
        this.taskmapper = taskmapper;
    }

    public TaskResponse createTask(PostTask request) {
        TaskEntity taskEntity = taskmapper.dtoToEntity(request);
        TaskEntity savedTaskEntity = taskRepository.save(taskEntity);

        return taskmapper.entityToDto(savedTaskEntity);

    }

    public TaskResponse getTask(Long id) {
        TaskEntity taskEntity = taskRepository.findById(id).
                orElseThrow(() -> new NotFoundException("Task по id: " + id + " не существует"));
        return taskmapper.entityToDto(taskEntity);
    }

    public List<TaskResponse> getTaskAll() {
        List<TaskEntity> tasks = taskRepository.findAll();
        return tasks.stream().map(taskmapper::entityToDto).toList();
    }

    @Transactional
    public TaskResponse updateTask(Long id, UpdateTask request) {
        TaskEntity taskEntity = taskRepository.findById(id).
                orElseThrow(() -> new NotFoundException("Task по id: " + id + " не существует"));
        if (request.title() != null) {
            taskEntity.setTitle(request.title());
        }
        if (request.description() != null) {
            taskEntity.setDescription(request.description());
        }
        if (request.completed() != null) {
            taskEntity.setCompleted(request.completed());
        }
        return taskmapper.entityToDto(taskEntity);


    }

    @Transactional
    public void deleteTask(Long id) {
        TaskEntity taskEntity = taskRepository.findById(id).
                orElseThrow(() -> new NotFoundException("Task по id: " + id + " не существует"));
        taskRepository.delete(taskEntity);

    }


}
