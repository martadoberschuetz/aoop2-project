package aoop2_project;

import java.util.Date;

public abstract class Gala {

	// data members
	private static int id;
	private int galaId;
	private Date galaDate;
	private String galaName;
	private String galaOrganiserName;
	private long galaOrganiserPhoneNumber;
	private String galaOrganiserEmail;
	private String poolAddress;
	private int durationInDays;
	private int poolLength;
	private static TypeOfTiming TypeOfTiming;
	enum TypeOfTiming {manual, electronic};
	private int payment;
	
	// no-argument constructor
	@SuppressWarnings("static-access")
	public Gala() {
		
		id++;
		setGalaId(id);
		setGalaDate(new Date());
		setGalaName("unknown");
		setGalaOrganiserName("unknown");
		setGalaOrganiserPhoneNumber(00000000);
		setGalaOrganiserEmail("unknown");
		setPoolAddress("unknown");
		setDurationInDays(0);
		setPoolLength(25);
		setTypeOfTiming(TypeOfTiming.electronic);
		setPayment(0);
	}
	
	// full-argument constructor	
	public Gala(Date galaDate, String galaName, String galaOrganiserName,
			long galaOrganiserPhoneNumber, String galaOrganiserEmail,
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
	public String getGalaOrganiserName(){
		return galaOrganiserName;
	}
	
	// phone number of the gala organiser
	public void setGalaOrganiserPhoneNumber(long galaOrganiserPhoneNumber) {
		this.galaOrganiserPhoneNumber = galaOrganiserPhoneNumber;		
	}
	public long getGalaOrganiserPhoneNumber(){
		return galaOrganiserPhoneNumber;
	}
	
	// email of the gala organiser
	public void setGalaOrganiserEmail(String galaOrganiserEmail) {
		this.galaOrganiserEmail = galaOrganiserEmail;		
	}
	public String getGalaOrganiserEmail(){
		return galaOrganiserEmail;
	}
	
	// pool address
	public void setPoolAddress(String poolAddress) {
		this.poolAddress = poolAddress;
	}
	public String getPoolAddress() {
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
		return "The ID of the gala is: " + getGalaId() 
				+ ",\nthe date of the gala is: " + getGalaDate()
				+ ",\nthe name of the gala is: " + getGalaName()
				+ ",\nthe name of the gala organiser is: " + getGalaOrganiserName()
				+ ",\nthe phone number of the gala organiser is: " + getGalaOrganiserPhoneNumber()
				+ ",\nthe email of the gala organiser is: " + getGalaOrganiserEmail()
				+ ",\nthe address of the pool is: " + getPoolAddress()
				+ ",\nduration of the gala in days is: " + getDurationInDays()
				+ ",\nthe length of the pool is: " + getPoolLength() + "m"
				+ ",\npayment for one event is: " + getPayment() + " euro.";
	}
	
	/*
	 * @param minutes minutes in the entry time
	 * @param seconds seconds in the entry time
	 * @param splitSeconds split seconds in the entry time
	 * @return time entry time
	 * */
	public int convertTime(int minutes, int seconds, int splitSeconds){
		return minutes*60 + seconds + splitSeconds/100;
	}
	
	
}