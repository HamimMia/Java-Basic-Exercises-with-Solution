// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package com.basicpart_1;

import java.util.Scanner;

public class Exercises11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter Your Radius: ");
		double input = in.nextDouble();

		System.out.println("Perimeter is = " + (2 * input * Math.PI));
		System.out.println("Area is = " + (Math.PI * input * input));
	}

}
