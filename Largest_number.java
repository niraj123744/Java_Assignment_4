package com.mypackage;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number1:");
		int num1 = input.nextInt();
		System.out.print("Enter the Number2 : ");
		int num2 = input.nextInt();
		System.out.print("Enter the Number3 : ");
		int num3 = input.nextInt();
		if (num1 >= num2 && num1 > num3)
			System.out.println(num1 + "is the maximum number.");
		else if (num2 >= num1 && num2 > num3)
			System.out.println(num2 + "is the maximium number.");
		else
			System.out.println(num3 + "is the maximum number.");
	}

}
