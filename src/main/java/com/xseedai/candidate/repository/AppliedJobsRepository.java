package com.xseedai.candidate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xseedai.candidate.entity.AppliedJobs;


public interface AppliedJobsRepository  extends JpaRepository<AppliedJobs, Long>  {

}
