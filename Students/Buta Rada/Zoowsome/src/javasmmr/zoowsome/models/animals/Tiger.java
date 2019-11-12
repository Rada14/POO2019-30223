package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammals {
	
	public Tiger(String name,Integer nrOfLegs,float percOfHair,float normalBodyTemp)
	{
	 super(name, nrOfLegs, percOfHair, normalBodyTemp);
	}
	
	public Tiger()
	{
		super("Tigy",4,56.7f,40.0f);
	}
	

}
