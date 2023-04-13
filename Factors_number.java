package com.mypackage;

import java.util.Scanner;

public class Factors_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		
		System.out.print("The factors of " + num + " are: ");
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
