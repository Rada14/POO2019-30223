package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammals extends Animals {
  private  float normalBodyTemp;
  private  float percBodyHair;




public Mammals(Double maintenanceCost, Double dangerPerc, float normalBodyTemp, float percBodyHair) {
	  super(maintenanceCost,dangerPerc);
	  this.normalBodyTemp=normalBodyTemp;
	  this.percBodyHair=percBodyHair;
	  // TODO Auto-generated constructor stub
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

 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "Perc Body Hair", String.valueOf(getPercBodyHair()));
		createNode(eventWriter, "Normal Body Temp", String.valueOf(getNormalBodyTemp()));
		}
 public void decodeFromXml( Element element) {
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("Perc Body Hair ").item(0).getTextContent( )));
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("Normal Body Temp").item(0).getTextContent()) );
		}
 }