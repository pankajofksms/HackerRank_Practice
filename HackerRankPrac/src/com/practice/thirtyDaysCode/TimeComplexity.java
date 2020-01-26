package com.practice.thirtyDaysCode;

import java.util.Scanner;

public class TimeComplexity {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int values = sc.nextInt();
		int[] arr = new int[values];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			isPrime(arr[i]);

		}

	}

	public static void isPrime(int n) {

		if (n == 1) {
			System.out.println("Not prime");
			return;
		}
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");

	}

}
