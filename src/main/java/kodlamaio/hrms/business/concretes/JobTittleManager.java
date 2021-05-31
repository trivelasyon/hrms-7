package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTittleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTittleDao;
import kodlamaio.hrms.entities.concretes.JobTittle;


@Service
public class JobTittleManager implements JobTittleService {
	
	private JobTittleDao jobTittleDao;
	
	@Autowired
	public JobTittleManager(JobTittleDao jobTittleDao) {
		super();
		this.jobTittleDao=jobTittleDao;
	}
   
	@Override
	public DataResult<List<JobTittle>> getJobTittle() {
		 
		return new SuccessDataResult(this.jobTittleDao.findAll(),"JobTittles are Listed");
	   
	}

	@Override
	public Result addJobTittle(JobTittle jobTittle) {
		// TODO Auto-generated method stub
		 this.jobTittleDao.save(jobTittle);
		 return new SuccessResult("New JobTittle is added");
	}



}
