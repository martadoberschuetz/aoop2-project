package aoop2_project;

import java.util.Date;

public class EuropeanChampionships extends Gala {

	private String country;
	
	//TODO:
	//qualifying times - database?
	
	public EuropeanChampionships(){
		super();
		setCountry("unknown");
	}
	
	public EuropeanChampionships(Date galaDate, String galaName,
			String galaOrganiserName, long galaOrganiserPhoneNumber,
			String galaOrganiserEmail, String poolAddress, int durationInDays,
			int poolLength, aoop2_project.Gala.TypeOfTiming typeOfTyming,
			int payment, String country) {
		super(galaDate, galaName, galaOrganiserName, galaOrganiserPhoneNumber,
				galaOrganiserEmail, poolAddress, durationInDays, poolLength,
				typeOfTyming, payment);
		setCountry(country);
	}

	// setters and getters for country
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "The ID of the gala is: " + getGalaId() 
				+ ",\nthe date of the gala is: " + getGalaDate()
				+ ",\nthe name of the gala is: " + getGalaName()
				+ ",\nthe name of the gala organiser is: " + getGalaOrganiserName()
				+ ",\nthe phone number of the gala organiser is: " + getGalaOrganiserPhoneNumber()
				+ ",\nthe email of the gala organiser is: " + getGalaOrganiserEmail()
				+ ",\nthe address of the pool is: " + getPoolAddress()
				+ ",\nthe gala is taking place in: " + getCountry()
				+ ",\nduration of the gala in days is: " + getDurationInDays()
				+ ",\nthe length of the pool is: " + getPoolLength() + "m"
				+ ",\npayment for one event is: " + getPayment() + " euro.";
	}
	
	
	
	

}