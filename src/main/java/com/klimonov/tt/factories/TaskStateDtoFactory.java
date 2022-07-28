package com.klimonov.tt.factories;


import com.klimonov.tt.domain.TaskStateEntity;
import com.klimonov.tt.dto.TaskStateDTO;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoFactory {
    public TaskStateDTO makeTaskStateDto(TaskStateEntity entity){
        return TaskStateDTO.builder()
                .id(entity.getId())
                .createdAt(entity.getCreatedAt())
                .title(entity.getTitle())
                .ordinal(entity.getOrdinal())
                .build();
    }
}
