package com.klimonov.tt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private Instant createdAt=Instant.now();
}
