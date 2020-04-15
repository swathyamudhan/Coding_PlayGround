package com.codingbat.array3;

public class SampleArraySquareUp {

	public static void main(String... args) {
		int n = 4;
		int[] arr4 = new int[n];
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int temp1 = n - 1;
		for (int i = temp1; i <= 3; i++) {
			arr1[i] = 1;
			System.out.print(arr1[i]);
		}
		System.out.print(" ");
		int temp2 = n - 2;
		int val1 = n - 2;
		for (int i = temp2; i <= 3; i++) {
			arr2[i] = val1;
			val1--;
			System.out.print(arr2[i]);
		}
		System.out.print(" ");
		int temp3 = n - 3;
		int val2 = n - 1;
		for (int i = temp3; i <= 3; i++) {
			arr2[i] = val2;
			val2--;
			System.out.print(arr2[i]);
		}
		System.out.print(" ");
		int val = n;
		for (int i = 0; i <= 3; i++) {
			arr4[i] = val;
			val--;
			System.out.print(arr4[i]);
		}

	}
}
