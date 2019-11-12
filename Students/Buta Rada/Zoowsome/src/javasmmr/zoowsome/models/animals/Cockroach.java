package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insects {
	
	public Cockroach(String name,Integer nrOfLegs,Boolean canFly,Boolean isDangerous)
	{
		super( name, nrOfLegs, canFly, isDangerous);
	}
	public Cockroach(){
		
			super("A",6,true,true);
			
		}
	}


