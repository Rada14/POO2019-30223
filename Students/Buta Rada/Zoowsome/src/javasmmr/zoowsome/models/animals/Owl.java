package javasmmr.zoowsome.models.animals;

public class Owl extends Bird {

	 public Owl(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude)
	 
	 {
		 super( nrOfLegs,  name,  migrates,  avgFlightAltitude);
	 }
	 public Owl()
	 {
	 super(2,"O",false,20);
	 }
	 
}
