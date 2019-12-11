package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Chameleon;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Iguanids;

public class ReptileFactory extends SpeciesFactory {

	@Override
	public Animals getAnimal(String type) {
		if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
			return new Crocodile(); // leave empty constructor, for now!
		} else if (Constants.Animals.Reptiles.Iguanids.equals(type)) {
			return new Iguanids();
		} 
		else if (Constants.Animals.Reptiles.Chameleon.equals(type)) {
			return new Chameleon();
		}
		return null;
	}

}