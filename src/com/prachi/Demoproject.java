package com.prachi;

import java.util.Scanner;

public class Demoproject {
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num /10;

		}
		System.out.println("sum of digit "+sum);
	}
}
