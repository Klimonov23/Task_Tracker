package com.klimonov.tt.repositories;

import com.klimonov.tt.domain.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
}
