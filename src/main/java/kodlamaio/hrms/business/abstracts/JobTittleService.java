package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobTittle;

public interface JobTittleService {
	
	DataResult<List<JobTittle>>getJobTittle();
	Result addJobTittle(JobTittle jobTittle);

}
