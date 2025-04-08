package immutable;

public class Java14Preview {

    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        System.out.println(person.name().concat(" age is ").concat(String.valueOf(person.age())));
    }
}
record Person(String name, int age) {}


