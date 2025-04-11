package inference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TypeInferenceInLambdaParameters {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "b", "c", null);
        String result = list.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result);

    }
}
