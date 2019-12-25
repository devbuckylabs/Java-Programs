package com.ds.org;

public class FindNumLinearSearchInArray {

	private int linearsearch(int[] arr,int num) {
		
		for (int i = 0; i < arr.length; i++) {
			if(num==arr[i]){
				return arr[i];
			}	
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10,65,5,6,76,38,47,88,110 };
		FindNumLinearSearchInArray obj=new FindNumLinearSearchInArray();
		int result= obj.linearsearch(arr,88);
		if(result==-1)System.out.println("Element not found");
		else System.out.println("Element found");
	}

}
