package javasmmr.zoowsome.repositories;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;


public abstract class EntityRepository <T extends XML_Parsable> {
	private final String xmlFilename;
	private final String entityTag;

	public EntityRepository(String xmlFilename, String entityTag) {
		this.xmlFilename = xmlFilename;
		this.entityTag = entityTag;
	}
	public void save(ArrayList <T> entities) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance() ;
		// Create X MLEvent Writer
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(this.xmlFilename));
		// Create a EventFactory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n ");
		// Create and writ e Start Tag
		StartDocument startDocument = eventFactory.createStartDocument( );
		eventWriter.add(startDocument);
		// Create content open tag
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (XML_Parsable entity : entities) {
		StartElement sElement = eventFactory.createStartElement("" , "" , this.entityTag);
		eventWriter.add(sElement);
		eventWriter.add(end);
		entity.encodeToXml (eventWriter);
		EndElement eElement = eventFactory.createEndElement("", "",this.entityTag);
		eventWriter.add(eElement);
		eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", " content"));
		eventWriter.add(eventFactory.createEndDocument() );
		eventWriter.close( );
		}
}