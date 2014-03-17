package project;

import java.util.Date;

public class NationalGala extends Gala{
	
	
	// no-argument constructor is inherited from the superclass
	public NationalGala(){
		super();		
	}	
	
	// full-argument constructor is inherited from the superclass
	public NationalGala(Date galaDate, String galaName,
			String galaOrganiserName, int galaOrganiserPhoneNumber,
			String galaOrganiserEmail, String poolAddress, int durationInDays,
			int poolLength, project.Gala.TypeOfTiming typeOfTyming, int payment) {
		super(galaDate, galaName, galaOrganiserName, galaOrganiserPhoneNumber,
				galaOrganiserEmail, poolAddress, durationInDays, poolLength,
				typeOfTyming, payment);

	}
}