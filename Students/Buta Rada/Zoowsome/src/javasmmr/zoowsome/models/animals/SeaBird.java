package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;
public class SeaBird extends Aquatic{

public SeaBird(String name,Integer nrOfLegs,Integer avgSwimDepth,waterType waterT) {
	  super( nrOfLegs,name, avgSwimDepth,waterT);
}
public SeaBird()
{
	  super(2,"Birdy",20,getWater());
	  
}


}
