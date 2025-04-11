package optional;

import java.util.Optional;

public class ofNullable {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Your input is empty"));

    }
}
