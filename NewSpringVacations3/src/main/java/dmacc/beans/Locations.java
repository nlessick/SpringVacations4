package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author {Nathaniel Essick} - nlessick
 * CIS175 - Spring 2021
 * {3/17/2021}
 */
@Entity
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String city;
	private int numDays;
	private int numPeople;
	@Autowired
	private PlaneInfo planeInfo;
	
	public Locations() {
		super();
		this.numPeople = 4;
	}
	

	public Locations(String city) {
		super();
		this.city = city;
	}


	public Locations(String city, int numDays, int numPeople) {
		super();
		this.city = city;
		this.numDays = numDays;
		this.numPeople = numPeople;
	}

	public Locations(long id, String city, int numDays, int numPeople) {
		super();
		this.id = id;
		this.city = city;
		this.numDays = numDays;
		this.numPeople = numPeople;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	public int getNumPeople() {
		return numPeople;
	}

	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}


	public PlaneInfo getPlaneInfo() {
		return planeInfo;
	}


	public void setPlaneInfo(PlaneInfo planeInfo) {
		this.planeInfo = planeInfo;
	}


	@Override
	public String toString() {
		return "Locations [id=" + id + ", city=" + city + ", numDays=" + numDays + ", numPeople=" + numPeople
				+ ", planeInfo=" + planeInfo + "]";
	}

	
}
