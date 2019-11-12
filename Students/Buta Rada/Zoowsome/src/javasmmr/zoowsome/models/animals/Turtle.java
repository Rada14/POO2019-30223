package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class Turtle extends Aquatic{

	public Turtle(Integer nrOfLegs,String name,Integer avgSwimDepth,waterType water)
	{
		super( nrOfLegs, name, avgSwimDepth, water);
		
	}
	
	public Turtle()
	{
		super(4,"Turtly",300,getWater());
	}
}
