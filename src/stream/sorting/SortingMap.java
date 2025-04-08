package stream.sorting;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 30);
        map.put("orange", 20);
        map.put("grape", 25);
        map.put("melon", 15);

        List<Map.Entry<String, Integer>> result = map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .collect(Collectors.toList());
        result.forEach(entry -> System.out.println(entry.getKey() +":"+entry.getValue()));


    }
}
