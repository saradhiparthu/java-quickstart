package arrays;

public class SimpleArrayOperations {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements
        System.out.println("First element: " + numbers[0]);

        // Modifying elements
        numbers[2] = 100;

        // Length of array
        System.out.println("Length: " + numbers.length);

        // Iterating over array
        System.out.println("Array elements Iterating using for-loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Enhanced for loop
        System.out.println("Array elements Iterating using Enhanced for loop: ");
        for (int num : numbers) {
            System.out.print(num);
        }
        // Iterate Array elements in reverse order
        System.out.println("Iterating Array elements in reverse order: ");
        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.print(numbers[j]);
        }
    }
}
