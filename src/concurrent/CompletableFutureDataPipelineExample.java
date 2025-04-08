package concurrent;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class CompletableFutureDataPipelineExample {

    public static void main(String[] args) throws Exception {

        // 1. Supplier: fetch data
        Supplier<List<String>> fetchUserNames = () -> Arrays.asList("Alice", "Bob", "Alex", "Charlie", "Angela");

        // 2. Predicate: filter names starting with 'A'
        Predicate<String> nameStartsWithA = name -> name.startsWith("A");

        // 3. Function: convert name to uppercase
        Function<List<String>, List<String>> toUpperCase = list ->
                list.stream()
                        .filter(nameStartsWithA) // Predicate used in Function
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        // 4. Consumer: print each name
        Consumer<List<String>> printNames = names ->
                names.forEach(name -> System.out.println("Processed User: " + name));

        // 5. CompletableFuture: Build the pipeline
        CompletableFuture
                .supplyAsync(fetchUserNames)
                .thenApply(toUpperCase)
                .thenAccept(printNames)
                .exceptionally(ex -> {
                    System.err.println("Error in pipeline: " + ex.getMessage());
                    return null;
                });

        // Keep main alive to see output
        Thread.sleep(1000);
    }
}
