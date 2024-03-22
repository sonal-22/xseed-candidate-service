package com.xseedai.candidate.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobListingDto {

	private Long jobId;

	private String jobCode;

	private String jobTitile;

	private String compamyName;

	private String countryName;

	private String stateName;
	
	private String cityName;

	private Long billRate;

	private Date requirementOpenDate;

	private Date requirementCloseDate;

	private String jobStatus;

	// Additional fields for filter options
	private String expiring;

	private String jobType;

	private String clientName;

	private String vmsName;
	
	private Long jobStatusId;
	
	private Long vmsId;
	
	private Long companyId;
	
	private Long jobTypeId;
	
	private Long clientId;
	
	private Long expiringId;

}
