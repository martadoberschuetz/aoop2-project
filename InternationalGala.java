package aoop2_project;

import java.util.Arrays;
import java.util.Date;



public class InternationalGala extends Gala {

	private String galaCountry;
	private String galaOrganiserName;
	private long galaOrganiserPhoneNumber;
	private String galaOrganiserEmail;
	private String poolAddress;
	private int durationInDays;
	private int poolLength;
	private static TypeOfTiming TypeOfTiming;
	enum TypeOfTiming {manual, electronic}
	
	
	// InternationalGala constructor
	public InternationalGala(String galaCountry, 
			String galaOrganiserName, long galaOrganiserPhoneNumber,
			String galaOrganiserEmail, String poolAddress, int durationInDays,
			int poolLength) {
		super();
		this.galaCountry = galaCountry;
		this.galaOrganiserName = galaOrganiserName;
		this.galaOrganiserPhoneNumber = galaOrganiserPhoneNumber;
		this.galaOrganiserEmail = galaOrganiserEmail;
		this.poolAddress = poolAddress;
		this.durationInDays = durationInDays;
		this.poolLength = poolLength;
	}
	
	
	public String getGalaCountry() {
		return galaCountry;
	}
	public void setGalaCountry(String galaCountry) {
		this.galaCountry = galaCountry;
	}
	
	
	public String getGalaOrganiserName() {
		return galaOrganiserName;
	}
	public void setGalaOrganiserName(String galaOrganiserName) {
		this.galaOrganiserName = galaOrganiserName;
	}
	
	
	public long getGalaOrganiserPhoneNumber() {
		return galaOrganiserPhoneNumber;
	}
	public void setGalaOrganiserPhoneNumber(long galaOrganiserPhoneNumber) {
		this.galaOrganiserPhoneNumber = galaOrganiserPhoneNumber;
	}
	
	public String getGalaOrganiserEmail() {
		return galaOrganiserEmail;
	}
	public void setGalaOrganiserEmail(String galaOrganiserEmail) {
		this.galaOrganiserEmail = galaOrganiserEmail;
	}
	
	public String getPoolAddress() {
		return poolAddress;
	}
	public void setPoolAddress(String poolAddress) {
		this.poolAddress = poolAddress;
	}
	
	public int getDurationInDays() {
		return durationInDays;
	}
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	
	public int getPoolLength() {
		return poolLength;
	}
	public void setPoolLength(int poolLength) {
		this.poolLength = poolLength;
	}
	
	public static TypeOfTiming getTypeOfTiming() {
		return TypeOfTiming;
	}
	public static void setTypeOfTiming(TypeOfTiming typeOfTiming) {
		TypeOfTiming = typeOfTiming;
	}


	@Override
	public String toString() {
		return "InternationalGala [galaCountry=" + galaCountry
				+ ", galaOrganiserName=" + galaOrganiserName
				+ ", galaOrganiserPhoneNumber=" + galaOrganiserPhoneNumber
				+ ", galaOrganiserEmail=" + galaOrganiserEmail
				+ ", poolAddress=" + poolAddress + ", durationInDays="
				+ durationInDays + ", poolLength=" + poolLength + "]";
	}
	
	
	
	
	

}