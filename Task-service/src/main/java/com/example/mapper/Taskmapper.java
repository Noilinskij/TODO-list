package com.example.mapper;

import com.example.model.dto.PostTask;
import com.example.model.dto.TaskResponse;
import com.example.model.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class Taskmapper {
    public TaskEntity dtoToEntity(PostTask postTask) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(postTask.title());
        taskEntity.setDescription(postTask.description());
        taskEntity.setCompleted(postTask.completed());
        return taskEntity;
    }

    public TaskResponse entityToDto(TaskEntity taskEntity) {
        return new TaskResponse(taskEntity.getId(), taskEntity.getTitle(),
                taskEntity.getDescription(), taskEntity.getCompleted());

    }
}
