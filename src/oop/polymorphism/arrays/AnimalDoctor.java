package oop.polymorphism.arrays;


public class AnimalDoctor {
	// works with arrays
	public void checkAnimals(Animal[] animals) {
		for (Animal animal : animals) {
			animal.checkup();
		}
	}

	public static void main(String[] args) {
		AnimalDoctor doctor = new AnimalDoctor();
		
		Dog[] dogs = { new Dog(), new Dog() };
		doctor.checkAnimals(dogs);
		
		Cat[] cats = { new Cat(), new Cat(), new Cat() };
		doctor.checkAnimals(cats);
		
		Bird[] birds = { new Bird(), new Bird() };
		doctor.checkAnimals(birds);
	}

}
