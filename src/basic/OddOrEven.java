package basic;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("You entered Even number:" + n);
        } else {
            System.out.println("You entered Odd number:" + n);
        }
    }
}
