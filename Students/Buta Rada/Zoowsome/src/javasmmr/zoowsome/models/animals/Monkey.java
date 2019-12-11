package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammals
{

	public Monkey(Double maintenanceCost,Double dangerPerc,float percBodyHair,float normalBodyTemp)
	{
		super(maintenanceCost,dangerPerc,normalBodyTemp,percBodyHair);

	}

	public Monkey()
	{
		super(11.1,0.4,34.4f,90.9f);
	}

	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Mammals.Monkey);
	
	}
}