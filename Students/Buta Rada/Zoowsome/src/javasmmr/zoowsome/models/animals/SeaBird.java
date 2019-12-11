package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class SeaBird extends Aquatic{

public SeaBird(Double maintenanceCost,Double dangerPerc,Integer avgSwimDepth,waterType waterT) {
	  super( avgSwimDepth,waterT,maintenanceCost,dangerPerc);
}
public SeaBird()
{
	  super(20,getWater(),23.3,0.2);

}

public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
{
super.encodeToXml(eventWriter);
createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
Constants.Animals.Aquatics.SeaBird);
}


}