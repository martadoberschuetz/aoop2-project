package aoop2_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * This class drop table Swimmer in case it already exists, 
 * and then creates a table called Swimmer. 
 * It also populates the table with some sample data. 
 * 
 * */

public class CreateTableSwimmers {

	public CreateTableSwimmers(){
		dropTableSwimmers();
		createTableSwimmers();
		populateTableSwimmers();
		viewSwimmers();
	}
	
	public void dropTableSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// drop table Swimmer 
			scriptStatement = connection.createStatement();
			
			String dropTableSwimmers = "DROP TABLE IF EXISTS SWIMMERS;";
			
			scriptStatement.executeUpdate(dropTableSwimmers);
			
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table Swimmers dropped.");
		
	}
	
	public void createTableSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// create table Swimmer 
			scriptStatement = connection.createStatement();
			
			String createTableSwimmers = "CREATE TABLE SWIMMERS " +
										"(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
										"FORENAME TEXT NOT NULL," +
										"SURNAME TEXT NOT NULL," +
										"DATE_OF_BIRTH DATE NOT NULL," +
										"GENDER TEXT NOT NULL,"+
										"PHONE_NUMBER TEXT NOT NULL,"+
										"EMAIL TEXT NOT NULL,"+
										"MEDICAL_CONDITIONS TEXT NOT NULL,"+
										"MEDICATION TEXT NOT NULL,"+
										"NEXT_OF_KIN_NAME TEXT NOT NULL," +
										"NEXT_OF_KIN_PHONE_NUMBER TEXT NOT NULL," + 
										"SWIM_CLUB TEXT NOT NULL," + 
										"STATUS TEXT NOT NULL," +
										"LEVEL TEXT NOT NULL)";
			
			scriptStatement.executeUpdate(createTableSwimmers);
			
			
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table Swimmers created.");
		
	}
		
	
	
	public void populateTableSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");

			// populate table Swimmers 
			scriptStatement = connection.createStatement();
			
			String populateTableSwimmers = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER,"
											+ "SWIM_CLUB, STATUS, LEVEL) VALUES "
											+ "('Michael', 'Phelps', '1984-06-30', 'male', '0909090', "
											+ "'michael.phelps@gmail.com', 'asthma', 'Seratin inhaler',"
											+ "'Debbie Phelps', '01819993', 'Baltimore Swimming Club', 'active', 'Masters') ;";
			
			String populateTableSwimmers2 = "INSERT INTO SWIMMERS (FORENAME, SURNAME, DATE_OF_BIRTH, GENDER, PHONE_NUMBER,"
											+ "EMAIL, MEDICAL_CONDITIONS, MEDICATION, NEXT_OF_KIN_NAME, NEXT_OF_KIN_PHONE_NUMBER,"
											+ "SWIM_CLUB, STATUS, LEVEL) VALUES "
											+ "('Jessica', 'Hardy', '1985-02-21', 'female', '0903229090', "
											+ "'jessica.hardy@gmail.com', 'none', 'n/a',"
											+ "'Dominik Meichtry', '011119993', 'California Swimming Club', 'active', 'Masters') ;";
			
			scriptStatement.executeUpdate(populateTableSwimmers);
			scriptStatement.executeUpdate(populateTableSwimmers2);
			
			// close the connection and statement
			scriptStatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			System.exit(0);
		}
		System.out.println("Table Swimmers populated.");
	}
	
	// for testing purposes only:
	
	public static void main(String[] abc){
		
		new CreateTableSwimmers();
	}
	
	public static void viewSwimmers(){
		
		Connection connection = null;
		Statement scriptStatement = null;

		try {
			// connect to database
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Swimmers.db");
			System.out.println("Database opened.");
			
			scriptStatement = connection.createStatement();
			
			ResultSet result = scriptStatement.executeQuery("SELECT * FROM SWIMMERS;");
			
			while (result.next()){
				int ID = result.getInt("ID");
				String forename = result.getString("FORENAME");
				String surname = result.getString("SURNAME");
				String dateOfBirth = result.getString("DATE_OF_BIRTH");
				String gender = result.getString("GENDER");
				String phoneNumber = result.getString("PHONE_NUMBER");
				String email = result.getString("EMAIL");
				String medicalConditions = result.getString("MEDICAL_CONDITIONS");
				String medication = result.getString("MEDICATION");
				String nextOfKinName = result.getString("NEXT_OF_KIN_NAME");
				String nextOfKinPhoneNumber = result.getString("NEXT_OF_KIN_PHONE_NUMBER");
				String swimClub = result.getString("SWIM_CLUB");
				String status = result.getString("STATUS");
				String level = result.getString("LEVEL");
				
				System.out.println("ID = " + ID);
				System.out.println("FORENAME = "+ forename);
				System.out.println("SURNAME = "+ surname);
				System.out.println("DATE_OF_BIRTH = " + dateOfBirth);
				System.out.println("GENDER = "+ gender);
				System.out.println("PHONE_NUMBER = "+ phoneNumber);
				System.out.println("EMAIL = "+ email);
				System.out.println("MEDICAL_CONDITIONS = "+ medicalConditions);
				System.out.println("MEDICATION = "+ medication);
				System.out.println("NEXT_OF_KIN_NAME = "+ nextOfKinName);
				System.out.println("NEXT_OF_KIN_PHONE_NUMBER = "+ nextOfKinPhoneNumber);
				System.out.println("SWIM_CLUB = "+ swimClub);
				System.out.println("STATUS = "+ status);
				System.out.println("LEVEL = "+ level);
				
			}
					
			result.close();
			scriptStatement.close();
			connection.close();
			
		} catch ( Exception e) {
			System.out.println(e.getClass().getName() + ": " +e.getMessage() );
			//System.exit(0);
		}
		System.out.println("Operation done successfully");
		
	}
	
}
