package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Chameleon extends Reptile {

	public Chameleon(Double maintenanceCost,Double dangerPerc ,Boolean laysEggs) {
		super(maintenanceCost,dangerPerc ,laysEggs);
	}

	public Chameleon() {
		super(24.0,0.7,true);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Reptiles.Chameleon);
	}
}