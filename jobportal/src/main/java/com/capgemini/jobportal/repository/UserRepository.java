package com.capgemini.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.jobportal.model.JobPortal;
@Repository
public interface UserRepository extends JpaRepository<JobPortal, Integer>{

}
