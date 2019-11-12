package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude)
	{
		super( nrOfLegs,  name, migrates,  avgFlightAltitude);
	}
	
	public Parrot()
	
	{
		super(2,"Koko",false,100);
		
	}
}
