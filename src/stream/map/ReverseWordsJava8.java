package stream.map;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsJava8 {
    public static void main(String[] args) {
        String names = "Hello Java";
        String words =Arrays.stream(names.split(" "))
                .map(e -> new StringBuilder(e).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(words);

    }
}
