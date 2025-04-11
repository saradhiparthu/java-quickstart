package oop.polymorphism.arrays;

public class AnimalDoctor2 {
	/*
	 * ArrayStoreException
	   Thrown to indicate that an attempt has been made to store the wrong type of object
	   into an array of objects.
	   What’s the Problem?
			Java arrays are covariant: Dog[] is a subtype of Animal[], so the compiler allows addAnimal(Dog[]).
			But at runtime, the actual array is still a Dog[], not a general Animal[].
			So when animals[0] = new Cat(); is executed:
			You're trying to put a Cat into a Dog[] array.
			Java throws an ArrayStoreException.
	 */
	public void addAnimal(Animal[] animals) {
		//animals[0] = new Cat(); // 💥 Potential ArrayStoreException here
		 // animals[0] = new Dog();
	}

	public static void main(String[] args) {
		AnimalDoctor2 doctor = new AnimalDoctor2();
		Dog[] dogs = { new Dog(), new Dog() }; // Dog[] array
		doctor.addAnimal(dogs); // Passing Dog[] as Animal[]

	}

}
