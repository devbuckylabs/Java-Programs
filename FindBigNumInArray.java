package com.ds.org;

public class FindBigNumInArray {

	public static void main(String[] args) {
		int countInner =0;
		int countOuter =0;
		
		// TODO Auto-generated method stub
		int arr[] = { 11, 9, 62, 34, 65, 55, 7, 5678, 1, 25, 89, 56, 1488, 367, 456, 22 };
		boolean isBig = true;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("countOuter "+countOuter);
			countOuter++;
			System.out.println("i is " + i);
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println("countInner "+countInner);
				countInner++;
				System.out.println("j is " + j);
				isBig = true;
				if (arr[i] > arr[j]) {
					System.out.println(arr[i] + " is greater than " + arr[j]);
					
					
				} else {
					System.out.println(arr[i] + " is less than " + arr[j]);
					System.out.println("breaking");
					System.out.println(arr[i] + " is not biggest");
					isBig = false;
					i=j-1;
					break;
				}
				
			}
			
			System.out.println("---------------------");
			System.out.println("---------------------");
			if (isBig) {
				System.out.println("#############################");
				System.out.println(arr[i] + " is the Biggest");
				System.out.println("inner loop count :"+countInner);
				System.out.println("outer loop count :"+countOuter);
				break;
				
			}
		}

	}

}
