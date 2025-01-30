public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        String prefix = "Hello, ";
        Greeting greeter = name -> System.out.println(prefix + name);
        greeter.sayHello("World");

    }
}
