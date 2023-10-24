package test;

import java.util.Scanner;

public class MilliSecond1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long l = sc.nextLong();
		long hr = 1 / (60*60*1000);
		l = 1 % (60 * 60 * 1000);
		long min = 1 / (60 * 1000);
		1 = 1 % (60 * 1000);
		long sec = 1 / 1000;
		System.out.println("Output: " + hr + ":" + min +":" + sec);
		
	}

}
