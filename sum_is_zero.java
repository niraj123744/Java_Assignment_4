package com.mypackage;

public class sum_is_zero {

	public static void find(int[] a) {
	for (int i = 0; i < a.length; i++) {
	for (int j = i + 1; j < a.length; j++) {
	for (int k = j + 1; k < a.length; k++) {
	if (a[i] + a[j] + a[k] == 0) {
	System.out.println("Found 3 elements whose sum is = 0");
	System.out.println("Elements are " + a[i] + " " + a[j] + " " + a[k]);
	return;
	}
	}
	}
	}
	System.out.println("Did not find 3 elements whose sum is = 0");
	}

	public static void main(String[] args) {
	int a[] = { 3, -1, -7, -4, -5, 9, 10 };
	find(a);
	}
    }
