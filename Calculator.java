package com.qa.calculator;

import java.util.Scanner;

public class Calculator {

	public static int addition() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int value1 = myObj.nextInt();

		System.out.println("Enter second number: ");
		int value2 = myObj.nextInt();

		return value1 + value2;
	}

	public static int subtraction() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int value1 = myObj.nextInt();

		System.out.println("Enter second number: ");
		int value2 = myObj.nextInt();

		return value1 - value2;
	}

	public static int multiplication() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int value1 = myObj.nextInt();

		System.out.println("Enter second number: ");
		int value2 = myObj.nextInt();

		return value1 * value2;
	}

	public static double division() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double value1 = myObj.nextDouble();

		System.out.println("Enter second number: ");
		double value2 = myObj.nextDouble();

		return value1 / value2;
	}

	public static void main(String[] args) {
		System.out.println("Addition");
		System.out.println(addition());
		System.out.println("Subtraction");
		System.out.println(subtraction());
		System.out.println("Multiplication");
		System.out.println(multiplication());
		System.out.println("Division");
		System.out.println(division());
	}

}
