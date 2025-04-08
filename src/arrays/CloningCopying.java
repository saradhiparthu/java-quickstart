package arrays;

import java.util.Arrays;
import java.util.Objects;

public class CloningCopying {
    public static void main(String[] args) {
        int[] original = {1, 2, 3};
        System.out.println(Arrays.toString(original));
        int[] clone = original.clone();
        clone[2] = 0;
        System.out.println(original[2]);
        System.out.println(clone[2]);

        Person[] people; // Declaration
        people = new Person[2];
        people[0] = new Person(1, "Kushal");
        System.out.println(people[0].getPerson());
        Person[] clonePeople = people.clone();
        clonePeople[0].id=2;
        System.out.println(clonePeople[0].getPerson());
        System.out.println(people[0].getPerson());


    }
}

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getPerson() {
        return this.id + ":" + this.name;
    }
}
