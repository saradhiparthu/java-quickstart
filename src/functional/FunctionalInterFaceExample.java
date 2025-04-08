package functional;

public class FunctionalInterFaceExample {

    public static void main(String[] args) {
        Greeting greeter = (message) -> {
            return "Hello"+message;
        };
        System.out.println(greeter.greet("World"));
        // Static method reference.
        Calculator f = Integer::sum;
        System.out.println(f.sum(1, 2));
    }
}
