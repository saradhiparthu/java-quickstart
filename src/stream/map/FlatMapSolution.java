package stream.map;

import java.util.Arrays;

public class FlatMapSolution {
    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3}, {4, 5}};

        Arrays.stream(nums).
                flatMap(e -> Arrays.stream(e).boxed())
                .toList()
                .forEach(System.out::println);

        Arrays.stream(nums)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);

        Arrays.stream(nums)
                .mapMultiToInt((array, consumer) -> {
                    for (int value : array) {
                        consumer.accept(value);
                    }
                }).forEach(System.out::println);
    }
}
