package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Iguanids extends Reptile {

	public Iguanids(Double maintenanceCost,Double dangerPerc,Boolean laysEggs)
	{
		super(maintenanceCost,dangerPerc , laysEggs);
	}

	public Iguanids()

	{
	  super(17.8,0.6,true);
	}

	  public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
		{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Reptiles.Iguanids);
		}
	

}