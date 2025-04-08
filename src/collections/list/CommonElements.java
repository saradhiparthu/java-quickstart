package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);
        // Java 8 Stream Approach:
        list1.stream().filter(list2::contains).toList().forEach(System.out::println);
        // Using retainAll (modifies original list)
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list4 = Arrays.asList(3, 4, 5, 6);
        list3.retainAll(list4);
        System.out.println(list3);
    }
}
