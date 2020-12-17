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

import com.src.model.Flights;
import com.src.service.FlightsService;

@Controller
public class FlightsController {
	private static final Logger logger = Logger
			.getLogger(FlightsController.class);
	public FlightsController()
	{
		System.out.println("FlightsController()");
	}
	@Autowired
	private FlightsService flightsService;

/*	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	} */
	
	@RequestMapping(value = "/FlightsList")
	public ModelAndView listFlights(ModelAndView model) throws IOException {
		List<Flights> ListFlights = flightsService.getAllFlights();
		Flights flight = new Flights();
		model.addObject("flight", flight);
		model.addObject("ListFlights", ListFlights);
		model.setViewName("flights");
		
		return model;
	} 
	
	@RequestMapping(value = "/newFlight", method = RequestMethod.GET)
	public ModelAndView newFlight(ModelAndView model) {
		Flights flight = new Flights();
		model.addObject("flight", flight);
		model.setViewName("FlightsList");
		return model;
	}

	@RequestMapping(value = "/saveFlight", method = RequestMethod.POST)
	public ModelAndView saveFlight(@ModelAttribute Flights flight) {
		if ( flight.getFlightID()== 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			flightsService.addFlights(flight);
		} else {
			flightsService.updateFlight(flight);
		}
		
		return new ModelAndView("redirect:/flights");
	}

	@RequestMapping(value = "/deleteFlight", method = RequestMethod.GET)
	public ModelAndView deleteFlight(HttpServletRequest request) {
		int flightId = Integer.parseInt(request.getParameter("id"));
		flightsService.deleteFlight(flightId);
		return new ModelAndView("redirect:/flights");
	}

	@RequestMapping(value = "/editFlight", method = RequestMethod.GET)
	public ModelAndView editFlight(HttpServletRequest request) {
		int flightId= Integer.parseInt(request.getParameter("id"));
		Flights flight = flightsService.getFlight(flightId);
		ModelAndView model = new ModelAndView("FlightsList");
		model.addObject("flight", flight);

		return model;
	}


}
