package optional;

import java.util.Optional;

public class orElseThrow {
    public static void main(String[] args) {
        Optional<String> name = Optional.empty();

        // String value = name.orElseThrow(); // Throws NoSuchElementException
        name.orElseThrow(() -> new IllegalArgumentException("Name is missing!"));
    }
}
