package com.example.mapper;

import com.example.model.dto.PostTask;
import com.example.model.dto.PostTaskResponse;
import com.example.model.entity.Task;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Task DtoToEntity(PostTask postTask) {
        Task task = new Task();
        task.setTitle(postTask.title());
        task.setDescription(postTask.description());
        task.setCompleted(postTask.completed());
        return task;
    }

    public PostTaskResponse EntityToDto(Task task) {
        return new PostTaskResponse(task.getId(), task.getTitle(),
                task.getDescription(), task.getCompleted());

    }
}
