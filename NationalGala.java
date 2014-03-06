package project;

import java.util.Date;

import project.Gala.TypeOfTiming;

public class NationalGala extends Gala{

	public NationalGala(Date galaDate, String galaName,
			String galaOrganiserName, int galaOrganiserPhoneNumber,
			String galaOrganiserEmail, String poolAddress, int durationInDays,
			int poolLength, project.Gala.TypeOfTiming typeOfTyming, int payment) {
		super(galaDate, galaName, galaOrganiserName, galaOrganiserPhoneNumber,
				galaOrganiserEmail, poolAddress, durationInDays, poolLength,
				typeOfTyming, payment);

	}

	

}