package com.mulesoft.demo.pss.lookup;


public class FlightLookupImpl implements FlightLookupService {

	private static int UPPER = 10000;
	@Override
	public LookUpResult getInformation(Route route) {
		System.out.println(route.toString());
		LookUpResult res = new LookUpResult();
		Integer price = new java.util.Random().nextInt(UPPER);
		res.setPrice(price);
		res.setRoute(route.toString());
		return res;
	}
}
