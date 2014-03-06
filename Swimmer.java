package project;

import java.util.Date;

public class Swimmer {

	//data members
	private static int id = 0;
	private int swimmerID;
	private String forename;
	private String surname;
	private Date dateOfBirth;
	private static Gender Gender;
	private enum Gender {female, male};
	private static Status Status;
	private enum Status {active, inactive};
	private int phoneNumber;
	private String email;
	private String medicalConditions;
	private String medication;
	private String nextOfKinName;
	private int nextOfKinPhoneNumber;
	private String swimClubName;
	
	
	public Swimmer(int swimmerID, String forename, String surname,
			Date dateOfBirth, Gender gender, int phoneNumber, String email,
			String medicalConditions, String medication,
			String nextOfKinName, int nextOfKinPhoneNumber,
			String swimClubName, Status status) {
		
		id++;
		this.swimmerID = id;
		this.forename = forename;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		Swimmer.Gender = gender;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.medicalConditions = medicalConditions;
		this.medication = medication;
		this.nextOfKinName = nextOfKinName;
		this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
		this.swimClubName = swimClubName;
		Swimmer.setStatus(status);
		
	}

	//getters and setters for id
	public int getSwimmerID() {
		return swimmerID;
	}
	public void setSwimmerID(int swimmerID) {
		this.swimmerID = swimmerID;
	}

	//getters and setters for forename
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}

	//getters and setters for surname
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	//will I need it?
	/*
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}*/

	
	//getters and setters for gender
	public Gender getGender(){
		return Gender;
	}
	public void setGender(Gender gender){
		Gender = gender;
	}

	//shouldnt SwimClub be a separate instansiable class?
	public String getSwimClubName() {
		return swimClubName;
	}
	public void setSwimClubName(String swimClubName) {
		this.swimClubName = swimClubName;
	}

	//getter and setter for status
	public static Status getStatus() {
		return Status;
	}
	public static void setStatus(Status status) {
		Status = status;
	}
			
}