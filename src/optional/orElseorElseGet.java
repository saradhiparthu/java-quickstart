package optional;

import java.util.Optional;

public class orElseorElseGet {
    public static void main(String[] args) {
        //orElse vs orElseGet
        /*
         1) Both are used to provide a fallback value when an Optional is empty.
            But the big difference lies in when that fallback code is executed.
         2) orElse(T) — Eager
            The argument is evaluated immediately, even if the Optional has a value.
            Can be inefficient if fallback involves computation or side effects.
         3) orElseGet(Supplier<? extends T>) — Lazy
            The Supplier is only called if the Optional is empty. Ideal when the fallback is expensive to compute.
         */
        Optional<String> result1 = Optional.of("Hello");
        System.out.println(result1.orElse(getDefault()));

        Optional<String> result2 = Optional.of("Hello");
        // Optional<String> result2 = Optional.ofNullable(null);
        System.out.println(result2.orElseGet(() -> {
            System.out.println("Default Supplier() is called anyway!");
            return "Default";
        }));
    }

    public static String getDefault() {
        System.out.println("getDefault() is called anyway!");
        return "Default";
    }
}
