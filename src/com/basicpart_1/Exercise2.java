// Write a Java program to print the sum of two numbers. Go to the editor, Test Data: 74 + 36.

package com.basicpart_1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner inport = new Scanner(System.in);

		System.out.print("Enter Your First Name: ");
		String fName = inport.next();

		System.out.print("Enter Your Last Name: ");
		String lName = inport.next();

		System.out.println();
		System.out.println("Hellow \n" + fName + " " + lName);

	}

}
