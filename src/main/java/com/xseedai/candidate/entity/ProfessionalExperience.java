package com.xseedai.candidate.entity;

import java.time.Month;
import java.time.Year;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ProfessionalExperience")
public class ProfessionalExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long experienceId;

	@Enumerated(EnumType.STRING)
	private Month startingMonth;

	private Year startingYear;

	@Enumerated(EnumType.STRING)
	private Month endingMonth;
	
	private Year endingYear;
	
	private Long duration;
	
	private String highestExperience;
	
	private String currentJobTitle;
	
	private String currentEmployeer;

	private String expectedSalary;
	
	private String currentSalary;

	
	@ManyToOne()
	@JoinColumn(name = "candidateId")
	@JsonIgnore
	private Candidate candidate;


}
