package com.practice.thirtyDaysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		Pattern pattern = Pattern.compile("@gmail.com$");
		Matcher matcher;
		List<String> list = new ArrayList();
		for (int NItr = 0; NItr < N; NItr++) {

			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];
			matcher = pattern.matcher(emailID);
			if (matcher.find()) {
				list.add(firstName);
			}
		}

		scanner.close();
		Collections.sort(list);
		for (int NItr = 0; NItr < list.size(); NItr++) {
			System.out.println(list.get(NItr));
		}

	}

}
