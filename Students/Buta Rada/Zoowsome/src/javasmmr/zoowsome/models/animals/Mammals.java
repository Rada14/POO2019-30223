package javasmmr.zoowsome.models.animals;

public abstract class Mammals extends Animals {
  private  float normalBodyTemp;
  private  float percBodyHair;
	
  public  Mammals(String name,Integer nrOfLegs,float normalBodyTemp, float percBodyHair)
	 { 
		  super(nrOfLegs,name);
		  this.normalBodyTemp=normalBodyTemp;
		  this.percBodyHair=percBodyHair;
	 }


 public void setNormalBodyTemp(float normalBodyTemp)
 {
	  this.normalBodyTemp=normalBodyTemp;
	  
 }
 public float getNormalBodyTemp()
 {
	 return this.normalBodyTemp;
	 
 }
 
 public float getPercBodyHair()
 {
	 return this.percBodyHair;
	 
 }
 public void setPercBodyHair(float percBodyHair)
 {
	  this.percBodyHair=percBodyHair;
 }
 }
