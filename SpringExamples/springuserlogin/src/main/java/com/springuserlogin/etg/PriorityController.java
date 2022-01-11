package com.springuserlogin.etg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class PriorityController {
	
	@Autowired
	LoginInterface loginImpl;
	
	
	@PutMapping("/restpriority/{taskid}/{priority}")
	public void updatePriority(@PathVariable int taskid , @PathVariable String priority) {
	loginImpl.setpriority(taskid, priority);
	}
}
