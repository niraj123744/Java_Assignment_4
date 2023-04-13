package com.mypackage;

import java.util.Random;
import java.util.Scanner;

public class Random_Flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		flipCoin();
	}

	private static void flipCoin() {
		// TODO Auto-generated method stub
		int coinFlip, head=0, tail=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of time to flip the coin");
		coinFlip=sc.nextInt();

		for(int i=0;i<coinFlip;i++) {
			if(Math.random()<0.5) {
				tail++;
			}
			else {
				head++;
			}
		}
		System.out.println("Count of tails"+tail);
		double cntTails=(tail/(double)coinFlip)*100;
		double cntHead=(head/(double)coinFlip)*100;
		System.out.println("Count of Heads"+head);
		System.out.println("Percantage of Tails"+cntTails);
		System.out.println("Percantage of Head"+cntHead);

	}

}
