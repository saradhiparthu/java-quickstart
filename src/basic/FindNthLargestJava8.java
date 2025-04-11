package basic;

import java.util.Arrays;

public class FindNthLargestJava8 {

	public static void main(String[] args) {
		int age[] = { 12, 35, 1, 10, 34, 1 };
		
		System.out.println(
				Arrays.stream(age)
				      .sorted()
				      .distinct()
				      .skip(3)
				      .findFirst()
				      .getAsInt());

	}

}
