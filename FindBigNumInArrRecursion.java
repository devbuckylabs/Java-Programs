package com.ds.org;

public class FindBigNumInArrRecursion {
	 int highest = Integer.MIN_VALUE;

	private int findBigNum(int[] arr, int n) {

		System.out.println("highest: "+highest);
		if (n == -1) {
			System.out.println("Reached arr[-1] of array");
			return highest;
		} else {
			System.out.println("from else");
			System.out.println("checking if " + arr[n] + " is greater than " + highest);
			if (arr[n] > highest) {
				System.out.println("greater");
				highest = arr[n];
				System.out.println("updating highest: " + highest);
			} else {
				System.out.println("NO, hence highest isn't updated");
			}
			return findBigNum(arr, n - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 9, 62, 34, 65, 55, 7, 5678, 1, 25, 89, 56, 1488, 367, 456, 22 };
		FindBigNumInArrRecursion obj = new FindBigNumInArrRecursion();
		System.out.println(obj.findBigNum(arr, arr.length - 1));
	}

}
