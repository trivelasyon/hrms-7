package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto;

@RestController
@RequestMapping("/api/Candidates")
public class CandidateController {
	
	private CandidateService candidateService;

	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService=candidateService;
	}
	
	@GetMapping("/getCandidateList")
	public List<Candidate> getCandidateList(){
		return this.candidateService.getCandidates();
	}
	
	
	
	
}
