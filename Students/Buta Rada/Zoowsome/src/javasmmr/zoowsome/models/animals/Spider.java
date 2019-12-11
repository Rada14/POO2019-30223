package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insects {
   public Spider(Double maintenanceCost,Double dangerPerc,Boolean canFly,Boolean isDangerous)
   {
	   super( maintenanceCost,dangerPerc, canFly,isDangerous);
   }

   public Spider()
   {
	   super(24.0,0.8,false,true);
   }
   public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Insects.Spider);
	}
}