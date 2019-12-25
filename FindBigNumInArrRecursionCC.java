package com.ds.org;

public class FindBigNumInArrRecursion2 {

	int highest = Integer.MIN_VALUE;

	private int findBigNum(int[] arr, int n) {
		if (n == -1) {
			return highest;
		} else {
			if (arr[n] > highest) {
				highest = arr[n];
			}
			return findBigNum(arr, n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 9, 62, 34, 65, 55, 7, 5678, 1, 25, 89, 56, 1488, 367, 456, 22 };
		FindBigNumInArrRecursion2 obj = new FindBigNumInArrRecursion2();
		System.out.println(obj.findBigNum(arr, arr.length - 1));

	}
}
