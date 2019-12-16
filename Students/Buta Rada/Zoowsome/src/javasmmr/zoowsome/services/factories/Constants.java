package javasmmr.zoowsome.services.factories;

public final class Constants {
	public static final class XML_TAGS
	{
		public static final String DISCRIMINANT="DIISCRIMINANT";
		public static final String ANIMAL="ANIMAL";
		public static final String EMPLOYEE = "EMPLOYEE";
		}

	public static final class Species {
		public static final String Mammals = "Mammals";
		public static final String Reptiles = "Reptiles";
		public static final String Birds = "Birds";
		public static final String Aquatics = "Aquatics";
		public static final String Insects = "Insects";
	}
	public static final class Employee{
		public static final String Caretakers="Caretaker";
	}
	public static final class Employees{
		public static final class Caretakers {  
			public static final String TCO_SUCCESS = "SUCCESS";   
			public static final String TCO_KILLED = "KILLED";    
			public static final String TCO_NO_TIME = "NO_TIME";   
		}
	}

	public static final class Animals {

		public static final class Mammals {
			public static final String Cat = "CAT";
			public static final String Dog = "DOG";
			public static final String Wolf = "WOLF";
			public static final String Cow = "COW";
			public static final String Monkey = "MONKEY";
			public static final String Tiger = "TIGER";
		}

		public static final class Reptiles {
			public static final String Lizzard = "LIZZARD";
			public static final String Snake = "SNAKE";
			// ...
			public static final String Iguanids = "IGUANIDS";
			public static final String Chameleon = "CHAMELEON";
			public static final String Crocodile = "CROCODILE";
		}

		public static final class Birds {

			public static final String Parrot = "PARROT";
			public static final String Owl = "OWL";
			public static final String Penguin = "PENGUIN";
			// TODO: complete this yourself
		}

		public static final class Aquatics {

			public static final String SeaBird = "SEABIRD";
			// TODO: complete this yourself
			public static final String StarFish = "STARFISH";
			public static final String Turtle = "TURTLE";
		}

		public static final class Insects {

			public static final String Cockroach = "COCKROACH";
			public static final String Butterfly = "BUTTERFLY";
			public static final String Spider = "SPIDER";
			// TODO: complete this yourself

		}
	}

	
}