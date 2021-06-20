// Write a Java program to compute the specified expressions and print the output.
// Test Data:
// ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
// Expected Output
// 2.138888888888889

package com.basicpart_1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter Your Number: ");
		int num1 = in.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
		}
	}

}
