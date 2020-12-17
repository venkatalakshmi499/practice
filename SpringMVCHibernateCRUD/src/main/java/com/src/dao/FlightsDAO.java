package com.src.dao;

import java.util.List;

import com.src.model.Employee;
import com.src.model.Flights;

public interface FlightsDAO {
	public void addFlights(Flights flights);

	public List<Flights> getAllFlights();

	public void deleteFlight(Integer flightID);

	public Flights updateFlight(Flights flights );

	public Flights getFlight(int flightID);

}
