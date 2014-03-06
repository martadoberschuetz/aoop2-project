package project;

import java.util.Date;

public abstract class Gala {

	private static int id;
	private int galaId;
	private Date galaDate;
	private String galaName;
	private String galaOrganiserName;
	private int galaOrganiserPhoneNumber;
	private String galaOrganiserEmail;
	private String poolAddress;
	private int durationInDays;
	private int poolLength;
	private static TypeOfTiming TypeOfTiming;
	enum TypeOfTiming {manual, electronic};
	private int payment;
	
		
	public Gala(Date galaDate, String galaName, String galaOrganiserName,
			int galaOrganiserPhoneNumber, String galaOrganiserEmail,
			String poolAddress, int durationInDays, int poolLength,
			TypeOfTiming typeOfTyming, int payment) {
		
		id++;
		setGalaId(id);
		setGalaDate(galaDate);
		setGalaName(galaName);
		setGalaOrganiserName(galaOrganiserName);
		setGalaOrganiserPhoneNumber(galaOrganiserPhoneNumber);
		setGalaOrganiserEmail(galaOrganiserEmail);
		setPoolAddress(poolAddress);
		setDurationInDays(durationInDays);
		setPoolLength(poolLength);
		setTypeOfTiming(typeOfTyming);
		setPayment(payment);
	}

	// id
	public int getGalaId() {
		return galaId;
	}
	public void setGalaId(int galaId) {
		this.galaId = galaId;
	}

	// date
	public Date getGalaDate() {
		return galaDate;
	}
	public void setGalaDate(Date galaDate) {
		this.galaDate = galaDate;
	}

	// name of the gala
	public String getGalaName() {
		return galaName;
	}
	public void setGalaName(String galaName) {
		this.galaName = galaName;
	}

	// name of the gala organiser
	public void setGalaOrganiserName(String galaOrganiserName) {
		this.galaOrganiserName = galaOrganiserName;
	}
	public String getGalaOrganiserName(String galaOrganiserName){
		return galaOrganiserName;
	}
	
	// phone number of the gala organiser
	public void setGalaOrganiserPhoneNumber(int galaOrganiserPhoneNumber) {
		this.galaOrganiserPhoneNumber = galaOrganiserPhoneNumber;		
	}
	public int getGalaOrganiserPhoneNumber(int galaOrgainserPhoneNumber){
		return galaOrgainserPhoneNumber;
	}
	
	// email of the gala organiser
	public void setGalaOrganiserEmail(String galaOrganiserEmail) {
		this.galaOrganiserEmail = galaOrganiserEmail;		
	}
	public String getGalaOrganiserEmail(String galaOrganiserEmail){
		return galaOrganiserEmail;
	}
	
	// pool address
	public void setPoolAddress(String poolAddress) {
		this.poolAddress = poolAddress;
	}
	public String getPoolAddress(String poolAddress) {
		return poolAddress;
	}
	
	// duration of the gala in days	
	public void setDurationInDays(int durationInDays) {
		this.durationInDays = durationInDays;
	}
	public int getDurationInDays() {
		return durationInDays;
	}
	
	// the length of the pool
	public void setPoolLength(int poolLength) {
		this.poolLength = poolLength;
	}
	public int getPoolLength() {
		return poolLength;
	}
	
	// type of timing
	public static void setTypeOfTiming(TypeOfTiming typeOfTiming) {
		TypeOfTiming = typeOfTiming;
	}
	public static TypeOfTiming getTypeOfTiming() {
		return TypeOfTiming;
	}

	// payment for one event in the gala
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getPayment() {
		return payment;
	}

	// the toString() method
	@Override
	public String toString() {
		return "The ID of the gala is: " + galaId 
				+ ",\n the date of the gala is: " + galaDate
				+ ",\n the name of the gala is: " + galaName
				+ ",\n the name of the gala organiser is: " + galaOrganiserName
				+ ",\n the phone number of the gala organiser is: " + galaOrganiserPhoneNumber
				+ ",\n the email of the gala organiser is: " + galaOrganiserEmail
				+ ",\n the address of the pool is: " + poolAddress
				+ ",\n duration of the gala in days is: " + durationInDays
				+ ",\n the length of the pool is: " + poolLength
				+ ",\n payment for one event is: " + payment;
	}
	
	/*
	 * @param minutes minutes in the entry time
	 * @param seconds secodns in the entry time
	 * @param splitSeconds seconds in the entry time
	 * @return time entry time
	 * */
	public int convertTime(int minutes, int seconds, int splitSeconds){
		return minutes*60 + seconds + splitSeconds/100;
	}
	
	
}