package com.mulesoft.demo.pss.booking;

public class FlightBookingImpl implements FlightBookingService {

	@Override
	public boolean book(Route route) {
		if (route != null) {
			System.out.print("Bookig flight for route: " + route.toString());
			return true;
		} else {
			return false;
		}
	}

}
