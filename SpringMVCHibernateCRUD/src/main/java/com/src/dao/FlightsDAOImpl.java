package com.src.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.src.model.Employee;
import com.src.model.Flights;
@Repository
public class FlightsDAOImpl implements FlightsDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addFlights(Flights flights) {
		sessionFactory.getCurrentSession().saveOrUpdate(flights);
		
	}

	@Override

	@SuppressWarnings("unchecked")
	public List<Flights> getAllFlights() {
		return sessionFactory.getCurrentSession().createQuery("from Flights")
				.list();
		
	}

	@Override
	public void deleteFlight(Integer flightID) {
		Flights flight = (Flights) sessionFactory.getCurrentSession().load(
				Flights.class, flightID);
		if (null != flight ) {
			this.sessionFactory.getCurrentSession().delete(flight );
		}
		
	}

	@Override
	public Flights updateFlight(Flights flights) {
		sessionFactory.getCurrentSession().update(flights);
		return flights;
	}

	@Override
	public Flights getFlight(int flightID) {
		return (Flights) sessionFactory.getCurrentSession().get(
				Flights.class, flightID);
	}
	

}
