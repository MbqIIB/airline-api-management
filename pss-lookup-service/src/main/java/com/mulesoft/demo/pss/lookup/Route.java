package com.mulesoft.demo.pss.lookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Route")
public class Route {

	@XmlElement(name = "from", required = true)
	private String from;
	@XmlElement(name = "to", required = true)
	private String to;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	public String toString() {
		return "Quotation for travel route from: "+from+" to: "+to+" requested.";
		
	}
}
