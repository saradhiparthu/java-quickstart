package oop.inheritance;

public class InheritanceSolution {
    public static void main(String[] args) {
       // Dog dog = new Dog();
        Animal dog = new Dog();  // Upcasting (Implicit)
        dog.makeSound(); // Works because it's inherited
        //dog.bark(); // Compilation error! Cannot access subclass methods
        ((Dog)dog).bark();
        if(dog instanceof Dog){
            System.out.println("");
        }
        Animal a = new Animal();
        Dog d = (Dog) a;
    }
}

