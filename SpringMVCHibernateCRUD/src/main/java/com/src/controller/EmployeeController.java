package com.src.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.src.model.Admin;
import com.src.model.Employee;
import com.src.service.AdminServiceI;
import com.src.service.EmployeeService;

@Controller
public class EmployeeController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	
	@Autowired
	private AdminServiceI adminService;
	
	@RequestMapping(value = "/")
	public ModelAndView displayHome(ModelAndView model) throws IOException {
		
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/adminlogin")
	public ModelAndView adminLogin(ModelAndView model) throws IOException {
		Admin admin=new Admin();		
		model.addObject("admin", admin);		
		model.setViewName("adminLogin");
		return model;
	}
	
	@RequestMapping(value = "/login")
	public ModelAndView adminLogin(@ModelAttribute("admin")Admin ad,ModelAndView model) throws IOException {
		
		boolean b=adminService.validate(ad);
		
		if(b)
		{
		model.setViewName("adminsuccess");
		}
		else
		{
			model.setViewName("adminLogin");
		}
		return model;
	}
	@RequestMapping(value = "/home")
	public ModelAndView adminLogout(ModelAndView model) throws IOException {
				
		model.setViewName("index");
		return model;
	}
	

//	@RequestMapping(value = "/")
//	public ModelAndView listEmployee(ModelAndView model) throws IOException {
//		List<Employee> listEmployee = employeeService.getAllEmployees();
//		model.addObject("listEmployee", listEmployee);
//		model.setViewName("home");
//		return model;
//	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}

//	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
//	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
//		if (employee.getId() == 0) { // if employee id is 0 then creating the
//			// employee other updating the employee
//			employeeService.addEmployee(employee);
//		} else {
//			employeeService.updateEmployee(employee);
//		}
//		return new ModelAndView("redirect:/");
//	}
//
//	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
//	public ModelAndView deleteEmployee(HttpServletRequest request) {
//		int employeeId = Integer.parseInt(request.getParameter("id"));
//		employeeService.deleteEmployee(employeeId);
//		return new ModelAndView("redirect:/");
//	}
//
//	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
//	public ModelAndView editContact(HttpServletRequest request) {
//		int employeeId = Integer.parseInt(request.getParameter("id"));
//		Employee employee = employeeService.getEmployee(employeeId);
//		ModelAndView model = new ModelAndView("EmployeeForm");
//		model.addObject("employee", employee);
//
//		return model;
//	}

}