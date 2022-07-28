package com.klimonov.tt.repositories;

import com.klimonov.tt.domain.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity,Long> {
}
