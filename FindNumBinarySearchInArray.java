package com.ds.org;

public class FindNumBinarySearchInArray {
	//start = 0 end = 10 mid = 5 

	private int binarySearch(int num,int arr[],int start,int end) {
		int mid = (start+end)/2;  //5
		System.out.println(end+" " +mid+" "+arr[mid]);
		
			while(start<=end){
				System.out.println("while");
			if(arr[mid] < num){ //right traversal
				System.out.println("if: "+arr[mid]+" is less than "+num);
				start = mid+1;
				System.out.println("updating start "+start);
			}
			else if(arr[mid]==num){
				break;
				
			}
			else{ //left traversal
				System.out.println("else: "+arr[mid]+" is greater than "+num);
				end = mid-1;
			}
			mid =(start+end)/2;
			System.out.println("mid updated "+mid);
			}
			
			if(start>end){
				System.out.println("element not found");
				return -1;
			}
		
		
		return arr[mid] ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10,20,30,40,50,60,70,80,90,100,110};
		FindNumBinarySearchInArray obj = new FindNumBinarySearchInArray();
        System.out.println(obj.binarySearch(88,arr,0,arr.length-1));
	}

}
