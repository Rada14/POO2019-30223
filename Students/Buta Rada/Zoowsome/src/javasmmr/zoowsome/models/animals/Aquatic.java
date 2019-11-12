package javasmmr.zoowsome.models.animals;

public abstract class Aquatic extends Animals {
	private Integer avgSwimDepth;
	public  enum waterType{
		saltWater, freshWater
		};
	private static waterType water;
	
	public Aquatic(Integer nrOfLegs,String name,Integer avgSwimDepth,waterType waterT)
	{
		super(nrOfLegs,name);
		this.avgSwimDepth=avgSwimDepth;
		water=waterT;
		
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth)
	{
		this.avgSwimDepth=avgSwimDepth;
		
	}
	
	public Integer getAvgSwimDepth()
	{
		return this.avgSwimDepth;
	}
	
	public void setWater(waterType thisWaterType)
	{   water=thisWaterType;
	
	}
	
	public static waterType getWater()
	{
		return water;
	}

}
