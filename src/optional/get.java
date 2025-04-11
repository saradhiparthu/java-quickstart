package optional;

import java.util.Optional;

public class get {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        // NoSuchElementException: No value present
        System.out.println(empty.get());
    }
}
