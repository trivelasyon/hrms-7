package kodlamaio.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

@Repository
public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

	
	List<JobAdvertisement>getByIsActiveTrue();
	
	List<JobAdvertisement>getByEmployer_Id(int id);
	
	List<JobAdvertisement>getBylastOfAppealDateBetweenAndIsActive(LocalDate startDate,LocalDate finalDate,boolean activated);
}
