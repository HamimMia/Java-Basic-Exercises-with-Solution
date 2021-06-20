// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

package com.basicpart_1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner inpor = new Scanner(System.in);

		System.out.print("Input First Number: ");
		int firstN = inpor.nextInt();

		System.out.print("Input Second Number: ");
		int secondN = inpor.nextInt();

		System.out.print("Expected Output: " + firstN * secondN);
	}

}
