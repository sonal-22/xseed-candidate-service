package com.xseedai.candidate.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.xseedai.candidate.dto.JobListingDto;
import com.xseedai.candidate.feignclient.RecruiterServiceFeignClient;
import com.xseedai.candidate.service.JobService;


@Service
public class JobServiceImpl implements JobService {
	
	@Autowired(required=true)
	private RecruiterServiceFeignClient recruiterServiceFeignClient;
	
	@Override
	public Page<JobListingDto> getAllJobs(Pageable pageable) {
		//Pageable pageable = PageRequest.of(page, size);
		return recruiterServiceFeignClient.getAllJobs(pageable);
		
	}

}
