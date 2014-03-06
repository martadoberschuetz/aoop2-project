package project;

import java.util.Date;

import project.Gala.TypeOfTiming;

public class TestNationalGala {

	public static void main(String[] args) {
		
		//Gui someGui = new Gui();
		
		/*
		 * public Gala(Date galaDate, String galaName, String galaOrganiserName,
			int galaOrganiserPhoneNumber, String galaOrganiserEmail,
			String poolAddress, int durationInDays, int poolLength,
			TypeOfTiming typeOfTyming, int payment) {
		 * */

		NationalGala traleeGala = new NationalGala(new Date(), "Kingdom Masters Gala", "Tim OConnell", 667777777, "timoconnell@traleesportscomplex.ie",
				"Tralee", 1, 25, TypeOfTiming.electronic, 7);
		
		System.out.println(traleeGala.toString());
		
	}
}