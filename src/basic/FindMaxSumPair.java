package basic;

import java.util.Arrays;

public class FindMaxSumPair {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, -5, 99, 12, 0, -1 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int out = arr[arr.length-1] + arr[arr.length -2];
		System.out.println(out);

	}

}
