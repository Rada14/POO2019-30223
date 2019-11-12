package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammals
{
	
	public Monkey(String name,Integer nrOfLegs,float percBodyHair,float normalBodyTemp)
	{
		super(name,nrOfLegs,percBodyHair,normalBodyTemp);
		
	}
	
	public Monkey()
	{
		super("Ann",2, 7.56f,36.1f);
	}

}
