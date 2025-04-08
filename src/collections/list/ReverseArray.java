package collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 1, 3, 4, 2);
        IntStream.range(0, list.size())  // Stream of indices
                .mapToObj(i -> list.get(list.size() - i - 1)).toList().forEach(System.out::println);

        // Problem 3: Reverse a List Without Using Built-in Collections.reverse()
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        IntStream.range(0, names.size())
                .mapToObj(i -> names.get(names.size() - i - 1))
                .toList().forEach(System.out::println);
    }
}
