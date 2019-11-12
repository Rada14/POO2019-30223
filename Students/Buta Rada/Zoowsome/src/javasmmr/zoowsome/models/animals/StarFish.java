package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.Aquatic.waterType;

public class StarFish extends Aquatic{

	  public StarFish(String name,Integer nrOfLegs,Integer avgSwimDepth,waterType waterT) {
		  super( nrOfLegs,name, avgSwimDepth,waterT);
	  }
	  public StarFish()
	  {
		  super(0,"Star",300,getWater());
		  
	  }

}
