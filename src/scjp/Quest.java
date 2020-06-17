package scjp;

import java.util.*;

public class Quest {

	public static void main(String[] args) {
		String[] colors = { "blue", "red", "green", "yellow", "orange" };
		Arrays.sort(colors);
		System.out.println("before int"+colors);
		int s2 = Arrays.binarySearch(colors, "orange");
		int s3 = Arrays.binarySearch(colors, "violet");
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s2+" "+s3);

	}

}
