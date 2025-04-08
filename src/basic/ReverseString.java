package basic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder builder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }
        System.out.println(builder.toString());
        // revers String using StringBuffer
        StringBuffer buffer = new StringBuffer(input);
        System.out.println(buffer.reverse());
    }
}
