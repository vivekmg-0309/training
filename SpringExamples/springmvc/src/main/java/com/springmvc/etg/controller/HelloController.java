package com.springmvc.etg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.etg.model.Task;

@Controller
public class HelloController {
	
	//handler method
		@RequestMapping("/sayhello")
		public String sayHello(Model model) {
			model.addAttribute("msg", "Hi How are you");
			return "hello";
		}
		
		@RequestMapping("/gettask")
		public String getTask(Model model) {
			Task task = new Task();
			task.setTaskid(1000);
			task.setTaskname("Create a controller");
			model.addAttribute("task", task);
			return "task";
		}
	

}
