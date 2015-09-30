package com.mulesoft.demo.pss.lookup;

import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName="lookupService", targetNamespace="ls")
public interface FlightLookupService {

	@WebResult(name="lookupTravelInformation")
	public LookUpResult getInformation(Route route);
}
