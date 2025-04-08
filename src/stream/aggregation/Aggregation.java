package stream.aggregation;

import java.util.List;

public class Aggregation {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .mapToInt(e -> e)
                         .reduce(0, (a, b) -> a + b);  // Accumulates the sum
                        //.sum();
        System.out.println(sum);

        int max = numbers.stream().mapToInt(e -> e)
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);  // Accumulates the max
        System.out.println(max);

        int min = numbers.stream().mapToInt(e -> e)
                .reduce(Integer.

MAX_VALUE, (a, b) -> a < b ? a : b);  // Accumulates the min
        System.out.println(min);
        List<String> words = List.of("Java", "8", "Streams", "Are", "Powerful");

        String result = words.stream()
                .reduce("", (a, b) -> a + b + " ");  // Accumulator concatenates strings

        System.out.println("Concatenated String: " + result.trim());
    }
}
