package stream.map;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWordsJava8Solution3 {
    public static void main(String[] args) {
        String words = "Java Hello";
        String result = Arrays.stream(words.split(" "))
                .map(word -> {
                    return new StringBuilder(word).reverse().toString();
                    /*
                    char[] chars = word.toCharArray();
                    String reverse = "";
                    for (int i = chars.length - 1; i >= 0; i--) {
                        reverse += chars[i];
                    }
                    return reverse;
                    */
                    /*return IntStream.range(0, word.length())
                            .mapToObj(i -> word.charAt(word.length() - 1 - i))
                            .map(String::valueOf)
                            .collect(Collectors.joining());*/
                })
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
