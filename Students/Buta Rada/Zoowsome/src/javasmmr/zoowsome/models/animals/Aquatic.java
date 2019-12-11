package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animals {
	private Integer avgSwimDepth;
	public  enum waterType{
		saltWater, freshWater
		};
	private static waterType water;
	
	public Aquatic(Integer avgSwimDepth,waterType waterT, Double maintenanceCost1, Double dangerPerc1)
	{
		super(maintenanceCost1,dangerPerc1);
		this.avgSwimDepth=avgSwimDepth;
		water=waterT;
		
	}
	
	public void setAvgSwimDepth(Integer avgSwimDepth)
	{
		this.avgSwimDepth=avgSwimDepth;
		
	}
	
	public Integer getAvgSwimDepth()
	{
		return this.avgSwimDepth;
	}
	
	public void setWater(waterType thisWaterType)
	{   water=thisWaterType;
	
	}
	
	public static waterType getWater()
	{
		return water;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "AvgSwimDepth", String.valueOf(getAvgSwimDepth()));
		createNode(eventWriter, "Water", String.valueOf(getWater()));
		}
	public void decodeFromXml( Element element) {
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("AvgSwimDepth").item(0).getTextContent( )));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("Water").item(0).getTextContent()) );
		}

}