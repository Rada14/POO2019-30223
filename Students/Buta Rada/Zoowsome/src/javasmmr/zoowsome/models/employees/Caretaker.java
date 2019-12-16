package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employees {
	private Double workingHours;

	public Caretaker(String name1, BigDecimal salary1, Double workingHours1) {
		super(name1, salary1);
		this.workingHours = workingHours1;

	}

	public void setHours(Double n) {
		this.workingHours = n;
	}

	public Double getHours() {
		return this.workingHours;
	}

	public String takeCareOf(Animals a) {
		if (a.kill())
			return Constants.Employees.Caretakers.TCO_KILLED;
		if (this.workingHours < a.getMaintenanceCost())
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		this.workingHours -= a.getMaintenanceCost();

		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "Working hours", String.valueOf(getHours()));

	}
	 public void decodeFromXml( Element element) {
			setHours(Double.valueOf(element.getElementsByTagName("Working hours").item(0).getTextContent( )));
	

}
}
