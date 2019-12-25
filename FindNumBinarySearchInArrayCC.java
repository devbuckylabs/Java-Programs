package com.ds.org;

public class FindNumBinarySearchInArrayCC {
	private int binarySearch(int num, int arr[], int start, int end) {
		int mid = (start + end) / 2;

		while (start <= end) {

			if (arr[mid] < num) { // right traversal

				start = mid + 1;

			} else if (arr[mid] == num) {
				break;

			} else { // left traversal

				end = mid - 1;
			}
			mid = (start + end) / 2;

		}

		if (start > end) {
			System.out.println("element not found");
			return -1;
		}

		return arr[mid];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		FindNumBinarySearchInArrayCC obj = new FindNumBinarySearchInArrayCC();
		System.out.println(obj.binarySearch(30, arr, 0, arr.length - 1));
	}

}
