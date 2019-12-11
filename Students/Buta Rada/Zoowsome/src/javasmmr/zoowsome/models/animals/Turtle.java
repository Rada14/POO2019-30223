package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Turtle extends Aquatic{

	public Turtle(Integer avgSwimDepth,waterType water,Double maintenanceCost,Double dangerPerc )
	{
		super(avgSwimDepth,water,maintenanceCost,dangerPerc );

	}

	public Turtle()
	{
		super(300,getWater(),20.23,0.1);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
	Constants.Animals.Aquatics.Turtle);
	}
}