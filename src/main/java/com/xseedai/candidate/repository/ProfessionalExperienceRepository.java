package com.xseedai.candidate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xseedai.candidate.entity.EducationDetails;
import com.xseedai.candidate.entity.ProfessionalExperience;

public interface ProfessionalExperienceRepository extends JpaRepository<ProfessionalExperience, Long> {

}
