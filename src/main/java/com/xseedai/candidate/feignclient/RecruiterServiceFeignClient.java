package com.xseedai.candidate.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xseedai.candidate.dto.JobListingDto;



@FeignClient(name = "recruiter-service") 
public interface RecruiterServiceFeignClient {
	
	@GetMapping(value="/api/joblisting/getAllJobs",consumes = "application/json")
	public Page<JobListingDto> getAllJobs(Pageable pageable);

}
