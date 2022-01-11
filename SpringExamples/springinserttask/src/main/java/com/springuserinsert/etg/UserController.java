package com.springuserinsert.etg;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springuserinsert.etg.model.UserBean;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserInterface UserImpl;
	
	@RequestMapping(method = RequestMethod.GET)
	public String login1(Model model) throws SQLException {
		UserBean t = new UserBean();
		model.addAttribute("User", t);
		boolean r = UserImpl.addUser(t);
		if (r== true) {
			return "insert";
					
		}
		else {
			return "user";
		}
		
		
	}
	

	

}

