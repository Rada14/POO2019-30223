package javasmmr.zoowsome.models.animals;

public class Spider extends Insects {
   public Spider(String name,Integer nrOfLegs,Boolean canFly,Boolean isDangerous)
   {
	   super( name, nrOfLegs, canFly,isDangerous);
   }
   
   public Spider()
   {
	   super("Spidy",8,false,true);
   }
}

