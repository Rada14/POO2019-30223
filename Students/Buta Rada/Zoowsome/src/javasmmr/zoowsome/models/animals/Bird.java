package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Bird extends Animals {
	private Boolean migrates;
	private Integer avgFlightAltitude;

	public Bird( Boolean migrates, Integer avgFlightAltitude,Double maintenanceCost,Double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.migrates = migrates;
		this.avgFlightAltitude = avgFlightAltitude;

	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;

	}

	public void setMigrates(Boolean migrates) {
		this.migrates = migrates;

	}

	public Boolean getMigrates() {
		return this.migrates;
	}

	public Integer getAvgFlightAltitude() {
		return this.avgFlightAltitude;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "Migrates", String.valueOf(getMigrates()));
		createNode(eventWriter, "AvgFlightAltitude", String.valueOf(getAvgFlightAltitude()));
		}

}