package datetime;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDemo {

	public static void main(String[] args) {
	// without Java 8
	int t = 120;
	int hours = t / 60; //since both are ints, you get an int
	int minutes = t % 60;
	System.out.printf("%02d:%02d \n", hours, minutes);
	
	// Java 8
	Duration d = Duration.ofMinutes(t);
	LocalTime clockTimeInHours = LocalTime.MIN.plus(d);
	System.out.println(clockTimeInHours);
	System.out.println(d.toDays());
	System.out.println(d.toHours());
	System.out.println(d.toMinutes());
	System.out.println(d.toMillis());
	}

}
