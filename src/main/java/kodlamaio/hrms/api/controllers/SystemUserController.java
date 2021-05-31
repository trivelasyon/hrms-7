package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemUser;
import kodlamaio.hrms.business.abstracts.SystemUserService;

@RestController
@RequestMapping("/api/SystemUsers")
public class SystemUserController {
	
	private SystemUserService systemUserService;
	
	@Autowired
	public SystemUserController(SystemUserService systemUserService) {
		this.systemUserService=systemUserService;
	}
	
	@GetMapping("/getUsers")
	public DataResult<List<SystemUser>>getUsers(){
		
		return this.systemUserService.getSystemUserList();
	}

}