package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Reptile extends Animals {
 private Boolean laysEggs;

 public Reptile(Double maintenanceCost,Double dangerPerc , Boolean laysEggs)
 { 
	  super(maintenanceCost,dangerPerc);
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

 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "Lays Eggs", String.valueOf(getLaysEggs()));
	
		}
}