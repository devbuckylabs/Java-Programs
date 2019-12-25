package com.ds.org;

public class FindBigNumInArray2 {

	private int findBigNum(int[] arr) {
		int biggestNum = arr[0]; 
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]>biggestNum){
				biggestNum=arr[i];
			}
			
		}
		return biggestNum;
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 9, 62, 34, 65, 55, 7, 5678, 1, 25, 89, 56, 1488, 367, 456, 22 };
		FindBigNumInArray2 obj= new FindBigNumInArray2();
		System.out.println(obj.findBigNum(arr));
	
	}

}
