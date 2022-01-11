package com.springuserlogin.etg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springuserlogin.etg.impl.LoginImpl;


@RestController
public class TaskToOwnerController {
	@Autowired
	LoginImpl loginImpl;
	
	
	@PutMapping("/updateownerid/{taskid}/{ownerid}")
	public void updateOwnerid(@PathVariable int taskid, @PathVariable int ownerid) {
	loginImpl.assignOwner(taskid, ownerid);
	}

}
