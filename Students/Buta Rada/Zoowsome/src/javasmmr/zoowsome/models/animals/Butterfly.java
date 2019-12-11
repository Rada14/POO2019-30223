package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insects {

	public Butterfly(Double maintenanceCost,Double dangerPerc, Boolean canFly, Boolean isDangerous) {
		super(maintenanceCost,dangerPerc, canFly, isDangerous);
	}

	public Butterfly() {
		super(20.9,0.1, true, false);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Insects.Butterfly);
	}
}