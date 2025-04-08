package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int result = i / j;
            System.out.println(result);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
