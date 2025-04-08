package stream.aggregation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMerger {
    public static void main(String[] args) {
        List<Map<String, Integer>> listOfMaps = List.of(
                Map.of("A", 1, "B", 2),
                Map.of("B", 3, "C", 4),
                Map.of("D", 5)
        );

        // Merge maps using reduce
        Map<String, Integer> mergedMap = listOfMaps.stream()
                .reduce(new HashMap<>(), (map1, map2) -> {
                    map2.forEach((key, value) ->
                            map1.merge(key, value, Integer::sum)
                    );
                    return map1;
                });

        System.out.println("Merged Map: " + mergedMap);
    }
}