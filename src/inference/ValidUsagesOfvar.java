package inference;

import java.util.List;

public class ValidUsagesOfvar {
    public static void main(String[] args) {
        var str = "Hello World";         // ✅ Inferred as String
        var age = 10;                    // ✅ Inferred as int
        var var = "var is not a keyword"; // ✅ Legal: 'var' is not a reserved keyword
        var count = 10;

        for (var i = 0; i < count; i++) { // ✅ Works in loop initialization
            System.out.println(i);
        }
        // You can use var in enhanced for-loops too:
        List<String> names = List.of("Alice", "Bob", "Charlie");
        for (var name : names) {
            System.out.println(name);
        }
    }

}
