package com.repository;

import com.model.WorkerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersRepository extends JpaRepository<WorkerModel, Integer> {
}
