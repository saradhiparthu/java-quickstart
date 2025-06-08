package collections.comparison;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava8Example1 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(10, "Kushal"));
        personList.add(new Person(1, "Anirudh"));
        personList.sort(Comparator.comparing(Person::id));
        personList.forEach(e -> System.out.println(e.id() + ":" + e.name()));
    }
}

record Person(int id, String name) {
}
