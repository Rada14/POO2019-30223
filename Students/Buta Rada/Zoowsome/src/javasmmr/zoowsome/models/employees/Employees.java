package javasmmr.zoowsome.models.employees;
import java.util.Random; 

import java.math.BigDecimal;

public  abstract class Employees  {
 private String name;
private Long   id;
private BigDecimal salary;
private Boolean isDead;
Random ra=new Random();
  


public Employees(String name,BigDecimal i) {
	this.name=name;
	this.salary=i;
	this.isDead=false;
   this.id=getId();
	
}

public void setId()
{
	Long n= 1000000000000L;
	Long nn=9999999999999L;
	this.id=n+((long)(ra.nextDouble()*(nn-n)));
}
public Long getId()

{
	return this.id;
}

public void setName(String name)
{
	this.name=name;
}

public String getName()
{
	return this.name;
}

public void setSalary(BigDecimal salary) {
	this.salary=salary;
}

public BigDecimal getSalary()
{
	 return this.salary;
}
public void setIsDead(Boolean d)
{
	this.isDead=d;
	}

public Boolean getisDead()
{
	return this.isDead;
}

}