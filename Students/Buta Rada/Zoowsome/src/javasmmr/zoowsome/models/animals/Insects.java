package javasmmr.zoowsome.models.animals;


public abstract class Insects extends Animals {

	private Boolean canFly;
	private Boolean isDangerous;
	
	public Insects(String name,Integer nrOfLegs,Boolean canFly,Boolean isDangerous)
	{
		super(nrOfLegs,name);
		this.canFly=canFly;
		this.isDangerous=isDangerous;
		
		
	}
	
	public void setIsDangerous(Boolean isDangerous)
	{
		this.isDangerous=isDangerous;
		
	}
	public void setCanFly(Boolean canFly)
	{
		 this.canFly=canFly;
		 
	}
	
	public Boolean getCanFly()
	{
		return this.canFly;
		
	}
	
	public Boolean getIsDangerous()
	{
		return this.isDangerous;
	}
	
	
}

