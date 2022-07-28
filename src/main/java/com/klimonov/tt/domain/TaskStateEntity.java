package com.klimonov.tt.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "task_state")
public class TaskStateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String title;
    @CreationTimestamp
    private Instant createdAt;
    private Long ordinal;
    @OneToMany
    @JoinColumn(name="task_state_id",referencedColumnName = "id")
    private List<TaskEntity> taskEntities = new ArrayList<>();
}
