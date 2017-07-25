package com.control.user;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.user.User;
import com.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserControl {
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public String toIndex(Model model) {
		Subject subject = SecurityUtils.getSubject();
		User user = userService.selectUserById(1);
		model.addAttribute("user", user);
		return "NewFile";
	} 
}
