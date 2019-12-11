package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class StarFish extends Aquatic{

	  public StarFish(Double maintenanceCost,Double dangerPerc,Integer avgSwimDepth,waterType waterT) {
		  super( avgSwimDepth,waterT,maintenanceCost,dangerPerc);
	  }
	  public StarFish()
	  {
		  super(300,getWater(),23.5,0.1);

	  }
	  public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
		{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Aquatics.StarFish);
		}

}