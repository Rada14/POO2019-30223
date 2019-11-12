package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insects {

	public Butterfly(String name,Integer nrOfLegs,Boolean canFly,Boolean isDangerous)
	{
		super( name, nrOfLegs, canFly,isDangerous);
	}
	public Butterfly()
	{
		super("Ella",6,true,false);
	}
}
