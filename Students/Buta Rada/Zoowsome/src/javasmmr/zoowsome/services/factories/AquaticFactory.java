package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animals;
import javasmmr.zoowsome.models.animals.SeaBird;
import javasmmr.zoowsome.models.animals.StarFish;
import javasmmr.zoowsome.models.animals.Turtle;

public class AquaticFactory extends SpeciesFactory {

		@Override
		public Animals getAnimal(String type) {
			if (Constants.Animals.Aquatics.SeaBird.equals(type)) {
				return new SeaBird(); // leave empty constructor, for now!
			} else if (Constants.Animals.Aquatics.StarFish.equals(type)) {
				return new StarFish();
			} 
			else if (Constants.Animals.Aquatics.Turtle.equals(type)) {
				return new Turtle();
			}
			return null;
		}

	}



