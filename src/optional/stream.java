package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("Saradhi");
        Optional<List<String>> listOptional = Optional.of(list);
        List<String> result = listOptional.stream()
                .flatMap(List::stream)
                .filter(e -> e != null).collect(Collectors.toList());
        System.out.println(result);
    }
}
