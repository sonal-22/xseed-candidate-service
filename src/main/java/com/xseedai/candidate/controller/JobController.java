package com.xseedai.candidate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xseedai.candidate.dto.JobListingDto;
import com.xseedai.candidate.service.JobService;


@RequestMapping("/api/candidate/job")
@RestController
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@GetMapping("/getAllJobs")

	public Page<JobListingDto> getAllJobs(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {
		Pageable pageable = PageRequest.of(page, size);
		return jobService.getAllJobs(pageable);
	}

}
