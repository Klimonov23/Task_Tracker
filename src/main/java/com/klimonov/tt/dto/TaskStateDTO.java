package com.klimonov.tt.dto;

import com.sun.istack.NotNull;
import lombok.*;

import java.time.Instant;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class TaskStateDTO {
    @NonNull
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private Long ordinal;
    @NonNull
    private Instant createdAt=Instant.now();
}
