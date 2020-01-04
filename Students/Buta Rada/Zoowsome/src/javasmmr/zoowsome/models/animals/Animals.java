package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;



import java.util.Scanner;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

public abstract class Animals implements Killer,XML_Parsable {
	private Integer nrOfLegs;
	private Boolean takenCareof;
	private String name;
	Double maintenanceCost;
	 Double dangerPerc;
	Scanner scann = new Scanner(System.in);

	
	public Animals(Double maintenanceCost2, Double dangerPerc2) {
	this.maintenanceCost=maintenanceCost2;
	this.dangerPerc=dangerPerc2;
		
	}
	public void decodeFromXml( Element element) {
		setNrOfLegs (Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent() ));
		setName(element.getElementsByTagName("name").item(0).getTextContent()) ;
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName( "maintenanceCost").item(0).getTextContent())) ;
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0 ).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()) );
		}


	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareof));
		}
	public boolean kill() {
		double randnr = Math.random();
		if (randnr > dangerPerc)
			return true;
		return false;
	}

	public Double getDangerPerc() {
		return this.dangerPerc;
	}

	public Animals(Integer nrOfLegs1, String name1, Boolean takenCareOf1,Double maintenanceCost1,Double dangerPerc1) {
		this.takenCareof =takenCareOf1;
		this.dangerPerc = dangerPerc1;
		this.maintenanceCost = maintenanceCost1;
		this.nrOfLegs = nrOfLegs1;
		this.name = name1;

	}

	public void setTakenCareOf(Boolean set) {
		this.takenCareof = set;
	}

	public Boolean getTakenCareOf() {
		return this.takenCareof;
	}

	public void setNrOfLegs(int nrLegs) {
		this.nrOfLegs = nrLegs;

	}

	public Double getMaintenanceCost() {
		return this.maintenanceCost;
	}
	public void setMaintenanceCost(Double maintenanceCost)
	{
		this.maintenanceCost=maintenanceCost;
	}
	public void setDangerPerc(Double l )
	{
		 this.dangerPerc=l;
	}

	public Integer getNrOfLegs() {
		return this.nrOfLegs;
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public String getName() {
		return name;
	}

}