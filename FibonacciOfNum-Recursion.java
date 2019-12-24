package com.recursion.org;

public class FibonacciOfNum {

	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
	int res=1;
	int a=0,b=1;
	
	private void fibonacci(int a,int b) {
		// TODO Auto-generated method stub
        if(res>100)return; 
        System.out.print(res+" ");
        res = a+b;
		fibonacci(b,res);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciOfNum obj= new FibonacciOfNum();
		obj.fibonacci(0, 1);
		
		
		
		/*
		 * int a=0,b=1,c=0; while(c<100){ c=a+b; System.out.print(c+" "); a=b;
		 * b=c; }
		 */
	}
}
