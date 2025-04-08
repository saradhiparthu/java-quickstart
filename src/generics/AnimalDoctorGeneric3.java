package generics;

import java.util.ArrayList;
import java.util.List;


public class AnimalDoctorGeneric3 {
	public void addAnimal(List< ? super Dog> animals) {
		//animals.add(new Cat()); // we can't add Cat type
	    animals.add(new Dog()); // we can add Dog type or a supper type of Dog
		//animals.add(new Object()); 
	}
	public static void main(String[] args) {
		AnimalDoctorGeneric3 doctor = new AnimalDoctorGeneric3();
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Dog());
		doctor.addAnimal(animals);
		
		//List<? extends Dog> list = new ArrayList<Dog>();
		//list.add(new Dog());
		
		//List<? extends Animal> list2 = new ArrayList<Dog>();
		//list.add(new Dog());
		
		List<? super Dog> list3 = new ArrayList<Animal>();
		list3.add(new Dog());
		//list3.add(new Cat());
		
		List<? super Animal> list4 = new ArrayList<Animal>();
		list4.add(new Dog());
		list4.add(new Cat());
		list4.add(new Bird());

		
	}
}
