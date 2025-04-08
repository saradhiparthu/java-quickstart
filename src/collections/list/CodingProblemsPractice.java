package collections.list;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodingProblemsPractice {
    public static void main(String[] args) {
        // Problem 1: Remove Duplicates
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
        System.out.println("Original List:");
        System.out.println(list);
        System.out.println("List without Duplicates");
        // stream.map.Solution:1
        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);
        // stream.map.Solution:2

        // stream.map.Solution:3 - Java 8+ Streams
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        System.out.println("List without Duplicates Alternative (Java 8+ Streams)");
        fruits.stream().distinct().forEach(System.out::println);
        //Problem 2: Find Second Largest Number
        List<Integer> nums = Arrays.asList(7, 2, 9, 4, 6);
        Integer secondLargest = nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargest);
        //Problem 4: Count Frequency of Elements
        List<String> colors = Arrays.asList("red", "blue", "red", "green", "blue", "red");
        Map<String, Long> frequency = colors.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Map.Entry<String, Long> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }


    }
}

