package com.xseedai.candidate.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.xseedai.candidate.entity.Candidate;

public interface CandidateRepository  extends JpaRepository<Candidate, Long>{

}
