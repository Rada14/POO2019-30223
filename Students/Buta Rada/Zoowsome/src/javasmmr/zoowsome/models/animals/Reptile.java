package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animals {
 private Boolean laysEggs;
 
 public Reptile(String name,Integer nrOfLegs,Boolean laysEggs)
 { 
	  super(nrOfLegs,name);
	  this.laysEggs=laysEggs;
 }
 
 public void setLaysEggs(Boolean laysEggs)
 {
	  this.laysEggs=laysEggs;
 }
 public  boolean getLaysEggs()
 {
	 return this.laysEggs;
 }
 
 
}
