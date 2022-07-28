package com.klimonov.tt.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter//getter setter toString equals
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "project")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String title;
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    @OneToMany
    @JoinColumn(name="project_id",referencedColumnName = "id")
    private List<TaskStateEntity> taskStateEntities = new ArrayList<>();
}
