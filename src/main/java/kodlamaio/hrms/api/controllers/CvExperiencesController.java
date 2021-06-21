package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.business.abstracts.CvExperiencesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.CvEducationWithCandidateDto;
import kodlamaio.hrms.entities.dtos.CvExperiencesWithCandidateDto;

@RestController
@RequestMapping("/api/cvExperience")
public class CvExperiencesController {
	
	private CvExperiencesService cvExperiencesService;

	@Autowired
	public CvExperiencesController(CvExperiencesService cvExperiencesService) {
		super();
		this.cvExperiencesService=cvExperiencesService;
	}
	
	@GetMapping("/getExperiencesnWithCandidate")
	public DataResult<List<CvExperiencesWithCandidateDto>> getExperiencesnWithCandidate(){
		return this.cvExperiencesService.getCvExperiencesWithCandidates();
	}
	
	@PostMapping("/setPosition")
	public Result setPosition(@RequestBody int id ,@RequestBody String position) {
		this.cvExperiencesService.updateCvExperience(id,position);
		return new SuccessResult("Updated is okey");
	}
	
}
