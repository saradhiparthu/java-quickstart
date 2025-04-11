package generics;

import oop.polymorphism.arrays.Animal;
import oop.polymorphism.arrays.Bird;
import oop.polymorphism.arrays.Cat;
import oop.polymorphism.arrays.Dog;

import java.util.ArrayList;
import java.util.List;



public class AnimalDoctorGeneric {
   // don't work for generic List
   // Read and Write possible
	public void checkAnimals(List<Animal> animals) {
		for (Animal animal : animals) {
			animal.checkup();
		}
	}
	public static void main(String[] args) {
		AnimalDoctorGeneric doctor = new AnimalDoctorGeneric();
		List<Animal> animals = new ArrayList<Animal>();
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add( new Dog());
		animals.addAll(dogs);
		
		List<Cat> cats = new ArrayList<Cat>();
		cats.add( new Cat());
		animals.addAll(cats);
		
		List<Bird> birds = new ArrayList<Bird>();
		birds.add( new Bird());
		animals.addAll(birds);
		// The method checkAnimals(ArrayList<Animal>) is not applicable for the arguments (List<Dog>) or List<Cat> or List<Bird>
		
		//doctor.checkAnimals(dogs); 
		//doctor.checkAnimals(cats);
		//doctor.checkAnimals(birds);
		
		
		doctor.checkAnimals(animals);
	}

}
