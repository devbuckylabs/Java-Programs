package com.ds.org;

public class FindNumBinarySearchInArrayRecursion {

	private int binarySearch(int[] arr, int start, int end, int num) {

		
		if (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == num) {
				return mid;
			}
			else if(arr[mid]<num){ //right
				return binarySearch(arr, mid+1, end, num);
				
			}
			else {  //left
				return binarySearch(arr, start, mid-1, num);
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		FindNumBinarySearchInArrayRecursion obj = new FindNumBinarySearchInArrayRecursion();
		int index = obj.binarySearch(arr, 0, arr.length - 1, 80);
		if(index==-1)
		System.out.println("Element not found ");
		else System.out.println("Element found at index: "+index);
	}

}
