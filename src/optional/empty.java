package optional;

import java.util.Optional;

public class empty {

    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.map(String::toLowerCase).orElseGet(() -> "default"));
        System.out.println(empty.isPresent());
    }
}
