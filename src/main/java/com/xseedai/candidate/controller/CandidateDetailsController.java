package com.xseedai.candidate.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@Tag(name = "Candidate-Details-Controller", description = "Endpoints for managing candidate details")
@RestController
@RequestMapping("api/candidatedetails")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class CandidateDetailsController {

}
