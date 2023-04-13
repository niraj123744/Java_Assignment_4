package com.mypackage;
import java.util.Scanner;
public class Harmonic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
harmonic();
		int terms, i;
		double sum = 0.0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms in series");
		terms = scanner.nextInt();
		System.out.println("Harmonic Series");
		for (i = 1; i <= terms; i++) {
			System.out.print("1/" + i + " ");
			sum += (double) 1 / i;
		}

		System.out.format("\nSum of Harmonic Series is %f", sum);
	}

	private static void harmonic() {
		// TODO Auto-generated method stub
		
	}
}

