package collections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person p = new Person("Kushal");
        set.add(p);
        System.out.println(set.contains(p));
        p.name ="Anirudh";
        System.out.println(set.contains(p));
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
