package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employees{
private Double workingHours;

	
public  Caretaker(String name1, BigDecimal salary1,Double workingHours1) {
	super(name1,salary1);
	this.workingHours=workingHours1;
	
}


public void setHours(Double n)
{
	this.workingHours=n;
}
public Double getHours()
{
	return this.workingHours;
}

public String takeCareOf(Animals a)
{      if (a.kill()) 
    return Constants.Employees.Caretakers.TCO_KILLED;   
      if (this.workingHours < a.getMaintenanceCost())
    return Constants.Employees.Caretakers.TCO_NO_TIME;    
    this.workingHours-=a.getMaintenanceCost();
    
	return Constants.Employees.Caretakers.TCO_SUCCESS;
}
}

