package stream.traverse;

import java.util.stream.Stream;

public class toArray {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "Go");
        String[] array = stream.toArray(String[]::new);

        for (String lang : array) {
            System.out.println(lang);
        }
    }
}
