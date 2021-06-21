package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto;

@RestController
@RequestMapping("/api/CvEducation")
public class CvEducationController {
	
	private CvEducationService cvEducationService;

	@Autowired
	public CvEducationController(CvEducationService cvEducationService) {
		super();
		this.cvEducationService=cvEducationService;
	}
	
	@GetMapping("/getEducationWithCandidate")
	public DataResult<List<CvEducationWithCandidateDto>> getCvEducationWithCandidate(){
		return this.cvEducationService.getCvEducationWithCandidate();
	}
	
	

}
