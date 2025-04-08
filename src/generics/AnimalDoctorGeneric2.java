package generics;

import java.util.ArrayList;
import java.util.List;


public class AnimalDoctorGeneric2 {
	// only Read and Write possible
	/*  
	public void addAnimal(List<Animal> animals) {
		animals.add(new Cat());
	}
	*/
	
	// Read-only method
	public void addAnimal(List< ? extends Animal> animals) {
		//animals.add(new Cat()); // we can't add if we use <? extends Animal>
		System.out.println(animals.get(0));
	}
	public void addNumberType(List<? extends Number> obj) {
		//obj.add(Integer.valueOf(1)); // we can't add if we use <? extends Number>
		System.out.println(obj.toString());
	}
	public static void main(String[] args) {
		
		AnimalDoctorGeneric2 doctor = new AnimalDoctorGeneric2();
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Dog());
		doctor.addAnimal(animals);
		
		List<Dog> dogs = new ArrayList<Dog>();
		doctor.addAnimal(dogs);
		
		//doctor.addNumberType(Integer.valueOf(1));
	}

}
