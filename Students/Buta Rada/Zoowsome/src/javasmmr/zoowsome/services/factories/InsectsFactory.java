package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;



public class InsectsFactory extends SpeciesFactory {

		@Override
		public Animals getAnimal(String type) {
			if (Constants.Animals.Insects.Cockroach.equals(type)) {
				return new Cockroach(); // leave empty constructor, for now!
			} else if (Constants.Animals.Insects.Spider.equals(type)) {
				return new Spider();
			} 
			else if (Constants.Animals.Insects.Butterfly.equals(type)) {
				return new Butterfly();
			}
			return null;
		}
}
