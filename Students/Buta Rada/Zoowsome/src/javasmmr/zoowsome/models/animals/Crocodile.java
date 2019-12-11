package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodile extends Reptile {
	public Crocodile(Double maintenanceCost,Double dangerPerc,Boolean laysEggs) {
		super(maintenanceCost,dangerPerc, laysEggs);
	}

	public Crocodile() {
		super(18.8,0.9,true);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Reptiles.Crocodile);
	}

}