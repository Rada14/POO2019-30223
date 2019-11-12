package javasmmr.zoowsome.models.animals;

public class Penguin extends Bird {

	public Penguin(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude)
{
	super(nrOfLegs, name,  migrates,  avgFlightAltitude);
}

public Penguin()
{
	 super(2,"Pingu",false,50);
}
}

