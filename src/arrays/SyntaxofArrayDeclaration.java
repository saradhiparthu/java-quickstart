package arrays;

import java.util.Arrays;

public class SyntaxofArrayDeclaration {

    public static void main(String[] args) {
        int[] ages;         // Declaration
        ages = new int[10]; // Initialization
        // default values are 0
        System.out.println(Arrays.toString(ages));

        // Declaration + Initialization
        int[] counts = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(counts));

    }
}
