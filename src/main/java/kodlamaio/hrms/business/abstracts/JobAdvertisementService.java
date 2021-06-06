package kodlamaio.hrms.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>>getByIsActiveTrue();
	
	DataResult<List<JobAdvertisement>>getByEmployer_Id(int id);
	
	DataResult<List<JobAdvertisement>>getBylastOfAppealDateBetweenAndIsActive(LocalDate startDate,LocalDate finalDate,boolean activated);
	
	Result add(JobAdvertisement jobAdvertisement);
	
	Result deactivateJobAdvertisement(Integer id);
}
