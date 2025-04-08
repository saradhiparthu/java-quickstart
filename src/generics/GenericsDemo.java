package generics;

//import java.util.ArrayList;
//import java.util.List;

class Parent {

}

class Child extends Parent {

}

public class GenericsDemo {

	public static void main(String[] args) {

		// Type mismatch: cannot convert from ArrayList<Child> to List<Parent>

		//List<Parent> list = new ArrayList<Child>();
	}

}
