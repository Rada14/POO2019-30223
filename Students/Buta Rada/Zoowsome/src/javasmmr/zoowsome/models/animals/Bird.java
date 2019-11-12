package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animals{
 private Boolean  migrates;
 private Integer avgFlightAltitude;
 
 public Bird(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude)
 {
	 super(nrOfLegs,name);
	 this.migrates=migrates;
	 this.avgFlightAltitude=avgFlightAltitude;
	 
 }
 
  public void setAvgFlightAltitude(Integer avgFlightAltitude)
  {
	  this.avgFlightAltitude=avgFlightAltitude;
	  
 
}
  public void setMigrates(Boolean migrates)
  {
	   this.migrates=migrates;
	   
  }
  public Boolean getMigrates()
  {
	  return this.migrates;
  }
  
  public Integer getAvgFlightAltitude()
  {
	  return this.avgFlightAltitude;
  }
  
}
