package optional;

import java.util.Optional;

public class ifPresent {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);

        opt.ifPresent((value) -> System.out.println("Executes the given lambda only if the value is present."));

        Optional<String> empty = Optional.empty();
        empty.ifPresent((value) -> System.out.println("Will not print"));

        Optional<String> json = Optional.of("value is present");
        json.ifPresent((value) -> {
            System.out.println(value.toUpperCase());
        });
    }

    //Safe: You don’t need to do if (email != null) checks.
    public void sendEmail(Optional<String> email) {
        email.ifPresent(e -> System.out.println("Sending email to: " + e));
    }
}
