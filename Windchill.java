package com.mypackage;

import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double t, v, w = 0;
		System.out.println("enter the temperature is fehrenheit :");
		t = sc.nextDouble();
		System.out.println("wind speed in miles per hour :");
		v = sc.nextDouble();

		if (t < 50) {
			if (v > 3 && v <= 20) {
				w = (double) (35.75 + 0.6215 + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
			}
			System.out.println(w);
		} else {
			System.out.println("invalid input:");
		}
	}
}