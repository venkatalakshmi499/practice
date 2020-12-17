package com.src.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.src.dao.FlightsDAO;
import com.src.model.Employee;
import com.src.model.Flights;

@Service
@Transactional
public class FlightsServiceImpl implements FlightsService {
	@Autowired
	private FlightsDAO flightsDAO;


	public void setFlightsDAO(FlightsDAO flightsDAO) {
		this.flightsDAO = flightsDAO;
	}

	@Override
	@Transactional
	public void addFlights(Flights flights) {
		flightsDAO.addFlights(flights);
		
	}

	@Override
	@Transactional
	public List<Flights> getAllFlights() {
		// TODO Auto-generated method stub
		return flightsDAO.getAllFlights();
	}

	@Override
	@Transactional
	public void deleteFlight(Integer flightID) {
		flightsDAO.deleteFlight(flightID);
		
	}

	@Override
	public Flights updateFlight(Flights flights) {
		// TODO Auto-generated method stub
		return flightsDAO.updateFlight(flights);
	}

	@Override
	public Flights getFlight(int flightID) {
		// TODO Auto-generated method stub
		return flightsDAO.getFlight(flightID);
	}

	
}
