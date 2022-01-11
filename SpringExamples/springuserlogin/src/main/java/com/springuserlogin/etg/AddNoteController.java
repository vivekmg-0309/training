package com.springuserlogin.etg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springuserlogin.etg.impl.LoginImpl;

@RestController
public class AddNoteController {
	
	@Autowired
	LoginImpl loginImpl;
	
	
	@PutMapping("/addnotes/{taskid}/{notes}")
	public void updateNote(@PathVariable int taskid, @PathVariable String notes) {
	loginImpl.addNote(taskid, notes);
	}


}
