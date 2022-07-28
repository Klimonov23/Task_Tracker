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
public class ProjectDTO {
    private Long id;
    private String title;
    private Instant createdAt;
    private Instant updatedAt;
}
