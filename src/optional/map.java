package optional;

import java.util.Optional;

public class map {
    public static void main(String[] args) {
        Optional<String> framework = Optional.of("Spring");
        System.out.println(framework.map(e -> e.toUpperCase()).orElse("Empty"));
    }
}

