package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Mammals;
import javasmmr.zoowsome.services.factories.Constants;

public class Cow extends Mammals {

	public Cow(Double maintenanceCost, Double dangerPerc, float normalBodyTemp, float percBodyHair) {
		super(maintenanceCost, dangerPerc, normalBodyTemp, percBodyHair);
	}

	public Cow() {
		super(7.8, 0.3, 38.7f, 78.9f);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Mammals.Cow);
	}

}