package com.mulesoft.demo.pss.booking;

import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName="bookingService", targetNamespace="bs")
public interface FlightBookingService {

	@WebResult(name="bookTravelInformation")
	public boolean book(Route route);
}

