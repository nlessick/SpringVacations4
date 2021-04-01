package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author {Nathaniel Essick} - nlessick
 * CIS175 - Spring 2021
 * {3/17/2021}
 */
@Embeddable
public class PlaneInfo {
	private String airlineName;
	private int flightNum;
	private int numOfBags;
	
	public PlaneInfo() {
		super();
	}

	public PlaneInfo(String airlineName, int flightNum, int numOfBags) {
		super();
		this.airlineName = airlineName;
		this.flightNum = flightNum;
		this.numOfBags = numOfBags;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}

	@Override
	public String toString() {
		return "PlaneInfo [airlineName=" + airlineName + ", flightNum=" + flightNum + ", numOfBags=" + numOfBags + "]";
	}
	
	
}
