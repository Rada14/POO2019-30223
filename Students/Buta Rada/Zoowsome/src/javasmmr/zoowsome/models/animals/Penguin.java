package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Penguin extends Bird {

	public Penguin(Double maintenanceCost,Double dangerPerc, Boolean migrates, Integer avgFlightAltitude)
{
	super(  migrates,  avgFlightAltitude,maintenanceCost,dangerPerc);
}

public Penguin()
{
	 super(false,200,4.5,0.3);
}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
{
super.encodeToXml(eventWriter);
createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
Constants.Animals.Birds.Penguin);
}
}

