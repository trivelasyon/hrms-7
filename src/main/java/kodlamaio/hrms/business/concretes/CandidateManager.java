package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.User;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;;

@Service
public class CandidateManager implements CandidateService{
	
	
	private CandidateDao candidateDao;
	private UserDao userDao;
	List<String>candidateIdentityList;

	@Autowired
	public CandidateManager(CandidateDao candidateDao,UserDao userDao) {
		super();
	
		this.candidateDao=candidateDao;
		this.userDao=userDao;
	}
		
	

	@Override
	public List<Candidate> getCandidates() {
		// TODO Auto-generated method stub
		return this.candidateDao.findAll();
	}


		
		
	
}

	

