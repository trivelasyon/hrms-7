package kodlamaio.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		this.jobAdvertisementDao=jobAdvertisementDao;
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActiveTrue(),"Aktif iş ilanlari basariyla alindi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer_Id(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByEmployer_Id(id),"Employer id2ye göre listeleme yapildi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getBylastOfAppealDateBetweenAndIsActive(LocalDate startDate,
			LocalDate finalDate, boolean activated) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getBylastOfAppealDateBetweenAndIsActive(startDate, finalDate, activated),"Tarihd durumuna göre listeleme yapildi");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		// TODO Auto-generated method stub
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job Advertisement eklendi");
	}

	@Override
	public Result deactivateJobAdvertisement(Integer id) {
		JobAdvertisement jobAdvertisement = this.jobAdvertisementDao.findById(id).get();
		jobAdvertisement.setActive(false);
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("deActivated");
	}
	

}
