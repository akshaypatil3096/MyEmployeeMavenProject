package com.app.controllers;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.User;
import com.app.services.UserService;

@Controller
@RequestMapping("/userFolder")
public class UserController {
	@Autowired
	@Qualifier("user_service_dao")
	private UserService service;

	public UserController() {
		// TODO Auto-generated constructor stub
		System.out.println("in deflt cntrler of user");
	}

	@GetMapping("/login")
	private String showLoginForm() {
		return "/userFolder/login";
	}
	
	@PostMapping("/login")
	private String proceedLoginForm(@RequestParam String uname,@RequestParam String pass,HttpSession hs,RedirectAttributes flashmap) {
		User ud=null;
		try {
			ud=service.loginUser(uname, pass);
			
		}catch(NoResultException e) {
			System.out.println("Exception " + e);
		}
		if(ud!=null) {
			flashmap.addFlashAttribute("msg","logged in successfully");
			System.out.println(uname);
			hs.setAttribute("uname", uname);
			return "redirect:/operation";
		}
		return "/userFolder/login";
	}
	
	@GetMapping("/register")
	private String showRegistrationForm(User user) {
		return "/userFolder/register";
	}

	@PostMapping("/register")
	private String proceedRegistrationForm(User u,RedirectAttributes flashmap) {
		flashmap.addFlashAttribute("mesg",service.registerUser(u));
		return "redirect:/userFolder/login";
	}
	


}
