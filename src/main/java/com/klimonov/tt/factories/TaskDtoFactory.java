package com.klimonov.tt.factories;

import com.klimonov.tt.domain.TaskEntity;
import com.klimonov.tt.dto.TaskDTO;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoFactory {
    public TaskDTO makeTaskDto(TaskEntity entity){
        return TaskDTO.builder()
                .id(entity.getId())
                .description(entity.getDescription())
                .title(entity.getTitle())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
