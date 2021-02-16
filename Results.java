package com.bae.results;

import java.util.Scanner;

public class Results {

	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static int percentage;

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter physics score: ");
		physics = myObj.nextInt();

		System.out.println("Enter chemistry score: ");
		chemistry = myObj.nextInt();

		System.out.println("Enter biology score: ");
		biology = myObj.nextInt();

		total = physics + chemistry + biology;
		System.out.println(getResults());
		getPercentage(total);

	}

	public static String getResults() {
		return "Physics: " + physics + " Chemistry: " + chemistry + " Biology: " + biology + " Total: " + total;
	}

	public static void getPercentage(int total) {
		double percentage = (total * 100) / 450;
		System.out.println("Percentage: " + percentage);
	}

}
