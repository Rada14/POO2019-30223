package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Parrot;
import javasmmr.zoowsome.models.animals.Penguin;




public class BirdFactory extends SpeciesFactory {

		@Override
		public Animals getAnimal(String type) {
			if (Constants.Animals.Birds.Parrot.equals(type)) {
				return new Parrot(); // leave empty constructor, for now!
			} else if (Constants.Animals.Birds.Penguin.equals(type)) {
				return new Penguin();
			} 
			else if (Constants.Animals.Birds.Owl.equals(type)) {
				return new Owl();
			}
			return null;
		}
} 