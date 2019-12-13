package com.example.crudops.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudops.Model.Jobs;
@Repository
public interface JobsRepository extends JpaRepository<Jobs, Integer> {

}
