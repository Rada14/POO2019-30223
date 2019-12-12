package javasmmr.zoowsome.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animals;


import javasmmr.zoowsome.models.animals.Parrot;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employees;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;


public class MainController {
	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		Animals a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		String name1 = a1.getName();
		System.out.println(name1);
		a1.setName("Tigrisor");
		a1.setNrOfLegs(4);
		a1.setTakenCareOf(false);
		
		System.out.println("Am dat numele noului tigru :" + a1.getName());
		Animals a2 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Cow);
		a2.setName("Cowy");
		a2.setNrOfLegs(4);
		a2.setTakenCareOf((true));
		
		System.out.println("Avem o vaca noua numita " + a2.getName() + " care are " + a2.getNrOfLegs()
				+ " picioare , are nevoie de " + a2.getMaintenanceCost()
				+ " ore de grija , iar procentul de pericol la care se expune un angajat avand grija de el este "
				+ a2.getDangerPerc());
		Animals a3 = speciesFactory2.getAnimal(Constants.Animals.Birds.Parrot);
		a3.setName("Coco");
		a3.setNrOfLegs(2);
		a3.setTakenCareOf(true);
 System.out.println("Papagalul nostru se numeste " + a3.getName() + " si are " + a3.getNrOfLegs()
				+ " picioare.Este periculos in procent de " + a3.getDangerPerc());
 Animals[] animalWeHave=new Animals[100];
 animalWeHave[0]=a1;
 animalWeHave[1]=a2;
 animalWeHave[2]=a3;
		Parrot p1 = new Parrot();
		p1.setMigrates(true);
		p1.setName("Rokko");
		p1.setNrOfLegs(2);
		System.out.println("Papagalul " + p1.getName() + " are " + p1.getNrOfLegs() + " picioare.\n " + " Migreaza : "
				+ p1.getMigrates()+"\nKills: " + p1.kill());
		EmployeeAbstractFactory f1 = new EmployeeAbstractFactory();
		EmployeeFactory ef = f1.getEmployeeFactory(Constants.Employee.Caretakers);
		Employees employee = ef.getEmployee(Constants.Employee.Caretakers);
		System.out.println(employee.getName());
		employee.setName("Richard");
		employee.setIsDead(false);
		BigDecimal sal1 = new BigDecimal(1234.50);
		employee.setSalary(sal1);
		((Caretaker) employee).setHours(23.3);
		System.out.println("Angajatul numit " + employee.getName() + " are salariul de : " + employee.getSalary()
				+ " si lucreaza " + ((Caretaker) employee).getHours() + " ore." + " Are grija de " + p1.getName() + ".   Detalii: " + ((Caretaker)employee).takeCareOf(p1));

	ArrayList<Animals> animals=new ArrayList<Animals>();		
			animals.add(animalWeHave[0]);
             animals.add(animalWeHave[1]);
             animals.add(animalWeHave[2]);
            
             AnimalRepository animalRepository=new AnimalRepository();
             animalRepository.save(animals);
	}
	
	
}