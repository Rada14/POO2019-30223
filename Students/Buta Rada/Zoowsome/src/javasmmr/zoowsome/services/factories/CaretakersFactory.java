package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employees;

public class CaretakersFactory extends EmployeeFactory {
	public Employees getEmployee(String type) {
		if(Constants.Employee.Caretakers.contentEquals(type)) {
			return new Caretaker(null,null,10.0);
		}
		return null;
	}

}
