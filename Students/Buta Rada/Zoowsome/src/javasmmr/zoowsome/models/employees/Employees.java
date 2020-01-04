package javasmmr.zoowsome.models.employees;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

public  abstract class Employees implements XML_Parsable  {
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
public  void setLongSalary(Long salaryLong)
{   
     salaryLong=Long.parseLong(String.valueOf(salary));
    
}

public void decodeFromXml( Element element) {
	setName (String.valueOf(element.getElementsByTagName("name").item(0).getTextContent() ));
setLongSalary(Long.valueOf(element.getElementsByTagName( "salary").item(0).getTextContent())) ;
	setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0 ).getTextContent()));

	}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
	createNode(eventWriter, "name", String.valueOf(this.name));
	createNode(eventWriter, "id", String.valueOf(this.id));
	createNode(eventWriter, "salary", String.valueOf(this.salary));
	createNode(eventWriter, "isDead", String.valueOf(this.isDead));

	}

}