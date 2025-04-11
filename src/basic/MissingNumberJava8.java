package basic;

import java.util.Arrays;

public class MissingNumberJava8 {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 5, 6, 2 };
		int max = Arrays.stream(arr).max().getAsInt();
		int expectedSum = max * (max + 1) / 2;
		int actualSum = Arrays.stream(arr).sum();
		int missing = expectedSum - actualSum;
		System.out.println("Missing Number in the array is " + missing);
	}

}
