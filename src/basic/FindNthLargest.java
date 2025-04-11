package basic;

import java.util.Arrays;

public class FindNthLargest {

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		int size = arr.length-1;
		int n = 3;
		if (size < 2) {
			System.out.printf(" Invalid Input ");
			return;
		}
		// Sort the array
		Arrays.sort(arr);
		// Start from n last element as the largest element is at last
		for (int i = size - n; i >= 0; i--) {
			// If the element is not equal to largest element
			if (arr[i] != arr[size - 1]) {
				System.out.printf("The second largest " + "element is %d\n", arr[i]);
				return;
			}
		}
		System.out.printf("There is no second largest element\n");
	}

}
