package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insects extends Animals {

	private Boolean canFly;
	private Boolean isDangerous;

	public Insects(Double maintenanceCost,Double dangerPerc,Boolean canFly,Boolean isDangerous)
	{
		super(maintenanceCost,dangerPerc);
		this.canFly=canFly;
		this.isDangerous=isDangerous;


	}

	public void setIsDangerous(Boolean isDangerous)
	{
		this.isDangerous=isDangerous;

	}
	public void setCanFly(Boolean canFly)
	{
		 this.canFly=canFly;

	}

	public Boolean getCanFly()
	{
		return this.canFly;

	}

	public Boolean getIsDangerous()
	{
		return this.isDangerous;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "Can fly", String.valueOf(getCanFly()));
		createNode(eventWriter, "Is Dangerous", String.valueOf(getIsDangerous()));
		}
	public void decodeFromXml( Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("Can Fly").item(0).getTextContent( )));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("Is Dangerous").item(0).getTextContent()) );
		}

}