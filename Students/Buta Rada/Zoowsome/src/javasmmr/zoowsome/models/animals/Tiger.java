package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammals {

	public Tiger(Double maintenanceCost,Double dangerPerc,float percOfHair,float normalBodyTemp)
	{
	 super(maintenanceCost,dangerPerc,normalBodyTemp,percOfHair);
	}

	public Tiger()
	{
		super(15.6,0.9,56.7f,40.0f);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Mammals.Tiger);
	}
}