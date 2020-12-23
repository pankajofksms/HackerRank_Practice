package com.practice.algorithms.warmup;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* 
 * https://www.hackerrank.com/challenges/staircase/problem
 * 
 */

public class PatternPrinting {
	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in); int number = scan.nextInt();
		 * printPattern(number);
		 */
		
		Map<Integer,Integer> map = new TreeMa<>();
		for(Entry<Integer,Integer> en : map.entrySet()) {
			en.ge
		}
		
	}
	
	private static void printPattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
	}
}
