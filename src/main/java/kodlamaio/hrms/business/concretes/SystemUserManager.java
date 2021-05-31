package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemUserDao;
import kodlamaio.hrms.entities.concretes.SystemUser;

@Service
public class SystemUserManager implements SystemUserService {
	
	private SystemUserDao systemUserDao;
	
	@Autowired
	public SystemUserManager(SystemUserDao systemUserDao) {
		this.systemUserDao=systemUserDao;
	}

	@Override
	public DataResult<List<SystemUser>> getSystemUserList()
    {
		
		return new SuccessDataResult(this.systemUserDao.findAll(),"SystemUsers are listed");
	}

	@Override
	public Result add(SystemUser systemUser) {
		// TODO Auto-generated method stub
		this.systemUserDao.save(systemUser);
		return new SuccessResult("systemUser is added");
	}

}
