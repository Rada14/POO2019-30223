package javasmmr.zoowsome.services.factories;
import javasmmr.zoowsome.models.employees.Employees;
public class EmployeeAbstractFactory extends 
EmployeeFactory{
	public EmployeeFactory getEmployeeFactory(String type)
	throws Exception{
		if(Constants.Employee.Caretakers.equals(type))
	{
	return new CaretakersFactory();
}
else
	throw new Exception("Invalid species exceptions");
}
	public Employees getEmployee(String type)
	{
		return null;
	}
}

