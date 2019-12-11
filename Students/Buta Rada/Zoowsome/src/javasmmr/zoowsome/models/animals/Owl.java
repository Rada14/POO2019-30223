package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Owl extends Bird {

	 public Owl(Double maintenanceCost ,Double dangerPerc,Boolean migrates, Integer avgFlightAltitude)

	 {
		 super(  migrates,  avgFlightAltitude,maintenanceCost,dangerPerc);
	 }
	 public Owl()
	 {
	 super(false,230,20.3,0.9);
	 }
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
		{
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.Owl);
		}
}