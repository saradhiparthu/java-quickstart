package generics;

public class AnimalDoctor2 {
	/*
	 * ArrayStoreException
	   Thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects
	 */
	public void addAnimal(Animal[] animals) {
		animals[0] = new Cat();
		
	}

	public static void main(String[] args) {
		AnimalDoctor2 doctor = new AnimalDoctor2();
		Dog[] dogs = { new Dog(), new Dog() };
		doctor.addAnimal(dogs);

	}

}
