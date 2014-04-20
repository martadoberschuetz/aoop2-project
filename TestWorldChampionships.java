package aoop2_project;

import java.util.Date;

import aoop2_project.Gala.TypeOfTiming;

public class TestWorldChampionships {

	@SuppressWarnings({ "static-access", "deprecation" })
	public static void main(String[] args) {
		
		// test the no-argument constructor
		WorldChampionships someGala = new WorldChampionships();
		System.out.println(someGala.toString());
				
		// test the full-argument constructor and toString()
		WorldChampionships worldChampionships = new WorldChampionships(new Date(2014, 8, 1), 
															"15th World Masters Swimming Chmapionships", 
															"Montreal Swimming Governing Body", 667777777, 
															"info@fina2014.fr",
															"Montreal", 14, 50, TypeOfTiming.electronic, 20, "Canada");
		System.out.println(worldChampionships.toString());
				
				
		// test the setters and getters
		worldChampionships.setGalaDate(new Date());
		System.out.println(worldChampionships.getGalaDate());
		worldChampionships.setGalaName("16th World Masters Swimming Championships");
		System.out.println(worldChampionships.getGalaName());
		worldChampionships.setGalaOrganiserName("Chandler Bing");
		System.out.println(worldChampionships.getGalaOrganiserName());
		worldChampionships.setGalaOrganiserPhoneNumber(66222626269l);
		System.out.println(worldChampionships.getGalaOrganiserPhoneNumber());
		worldChampionships.setGalaOrganiserEmail("bing@gmail.com");
		System.out.println(worldChampionships.getGalaOrganiserEmail());
		worldChampionships.setPoolAddress("New York");
		System.out.println(worldChampionships.getPoolAddress());
		worldChampionships.setDurationInDays(16);
		System.out.println(worldChampionships.getDurationInDays());
		worldChampionships.setPoolLength(50);
		System.out.println(worldChampionships.getPoolLength());
		worldChampionships.setTypeOfTiming(TypeOfTiming.manual);
		System.out.println(worldChampionships.getTypeOfTiming());
		worldChampionships.setPayment(80);
		System.out.println(worldChampionships.getPayment());
		worldChampionships.setCountry("USA");
		System.out.println(worldChampionships.getCountry());
				
		// test toString() again
		System.out.println(worldChampionships.toString());
		

	}

}
