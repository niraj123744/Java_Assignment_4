package com.mypackage;
import java.util.Scanner;
public class Quotient_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		qua();


	}

	private static void qua() {
		Scanner sc=new Scanner(System.in);
		int divisor, divident;
		System.out.println("Enter Divisor");
		divisor=sc.nextInt();
		System.out.println("Enter Divident");
		divident=sc.nextInt();

		int quotient=divident/divisor;
		int remainder=divident%divisor;

		System.out.println(quotient);
		System.out.println(remainder);

	}

}

