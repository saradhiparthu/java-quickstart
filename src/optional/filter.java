package optional;

import java.util.Optional;

public class filter {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("ChatGPT");
        System.out.println(name.filter(e -> e.startsWith("C")).orElse("Unknown"));
    }
}
