package javasmmr.zoowsome.models.animals;

public abstract class Animals {
	
	private Integer nrOfLegs;
	 private String name;
	
	 
	 public Animals(Integer nrOfLegs, String name) {
		 this.nrOfLegs=nrOfLegs;
		 this.name=name;
	}
	 public void setNrOfLegs(int nrLegs)
	 {
		 this.nrOfLegs=nrLegs;
		 
	 }
	 public Integer getNrOfLegs()
	 {
		 return this.nrOfLegs;
	 }
	 
	 public void setName(String nm)
	 {
		  this.name=nm;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 
}
