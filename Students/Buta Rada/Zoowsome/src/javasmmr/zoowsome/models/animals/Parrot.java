package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Parrot extends Bird {
	public Parrot(Double maintenanceCost,Double dangerPerc, Boolean migrates, Integer avgFlightAltitude)
	{
		super( migrates,  avgFlightAltitude,maintenanceCost,dangerPerc);
	}

	public Parrot()

	{
		super(false,450,12.34,0.2);

	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Birds.Parrot);
	}
}