package com.klimonov.tt.factories;

import com.klimonov.tt.domain.ProjectEntity;
import com.klimonov.tt.dto.ProjectDTO;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoFactory {

    public ProjectDTO makeProjectDTO(ProjectEntity entity){
        return  ProjectDTO.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .build();
    }
}
