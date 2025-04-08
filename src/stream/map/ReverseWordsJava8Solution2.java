package stream.map;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsJava8Solution2 {
    public static void main(String[] args) {
        String words = "Hello Java";
        String result = Arrays.stream(words.split(" "))
                .map(e -> {
                    //return new StringBuilder(e).reverse().toString();
                    char[] chars = e.toCharArray();
                    String word="";
                    for (var i = chars.length - 1; i >= 0; i--) {
                        word += chars[i];
                    }
                    return  word;
                }).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
