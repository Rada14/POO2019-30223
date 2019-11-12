package javasmmr.zoowsome.models.animals;

public class Cow extends Mammals{
	public Cow(String name ,Integer nrOfLegs,float normalBodyTemp,float percBodyHair )
	{
		super( name , nrOfLegs, normalBodyTemp,percBodyHair );
	}
	public Cow()
	{
		super("Milka",4, 37.5f , 34.6f);
	}
	

}
