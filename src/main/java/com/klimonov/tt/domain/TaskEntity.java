package com.klimonov.tt.domain;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;


@Setter
@Getter
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String title;
    private String description;
    @CreationTimestamp
    private Instant createdAt;

}
