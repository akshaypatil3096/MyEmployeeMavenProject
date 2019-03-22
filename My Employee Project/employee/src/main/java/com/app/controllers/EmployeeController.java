package com.app.controllers;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Employee;
import com.app.services.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	@Qualifier("employee_service_dao")
	private EmployeeService service;

	public EmployeeController() {
		// TODO Auto-generated constructor stub
		System.out.println("In emp controller");
	}

	@GetMapping("/view")
	private String showEmp(Model map) {
		// TODO Auto-generated method stub
		System.out.println("In show emp");
		map.addAttribute("emp_list", service.listEmployees());
		return "viewEmp";
	}

	@GetMapping("/add")
	private String showAddForm() {
		System.out.println("in show add");

		return "/add";
	}

	@PostMapping("/add")
	private String proceedAddForm(Employee e, RedirectAttributes flashmap) {
		System.out.println("in proceed add" + e);
		flashmap.addFlashAttribute("mesg", service.addEmployee(e));

		return "redirect:/view";
	}

	@GetMapping("/delete")
	private String deleteEmp(@RequestParam int id, RedirectAttributes flashmap) {
		System.out.println("in delete user " + id);
		flashmap.addAttribute("mesg", service.deleteEmployee(id));
		return "redirect:/view";
	}

	@GetMapping("/update")
	private String showUpdateEmp(@RequestParam int id, Model map) {
		System.out.println("In  show UpdateApp  " + id);
		map.addAttribute("details", service.getEmployeeDetails(id));
		return "/updateEmp";
	}

	@PostMapping("/update")
	private String proceedUpdatEmp(Employee e, RedirectAttributes flashmap) {
		System.out.println(e);
		flashmap.addAttribute(service.updateEmployee(e));
		return "redirect:/view";
	}

	@GetMapping("/search")
	private String showSearchForm() {
		System.out.println("In show search form ");
		return "/searchEmp";
	}

	@PostMapping("/search")
	private String proceedSearchForm(@RequestParam int id, Model map) {
		System.out.println("In proceed search form " + id);
		Employee details=null;
		try {
			details =  service.getEmployeeDetails(id);
			
		} catch (NoResultException e) {
			System.out.println("Details are not present " + e);
		}
		if (details != null) {
			System.out.println(details);
			map.addAttribute("empdetails", details);
			return "/showDetails";
		}
		return "/searchEmp";
	}
	
	@GetMapping("/showDetails")
	private String showShowdetailsForm() {
		System.out.println("In show showDetails form ");
		return "/showDetails";
	}
	
	@GetMapping("/operation")
	private String showOperationForm() {
		return "/operation";
	}
	

	@GetMapping("/logout")
	private String showLogout(RedirectAttributes map) {
		System.out.println("in show logout");
		map.addFlashAttribute("Logged out successfully", "logout");
		return "/logout";
	}

}
