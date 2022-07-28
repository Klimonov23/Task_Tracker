package com.klimonov.tt.repositories;

import com.klimonov.tt.domain.TaskStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity,Long> {
}
