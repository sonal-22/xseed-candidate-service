package com.xseedai.candidate.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xseedai.candidate.dto.JobListingDto;



public interface JobService {
	public Page<JobListingDto> getAllJobs(Pageable pageable);
}
