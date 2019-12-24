package com.recursion.org;

public class FactorialWithReturn {

	private int fact(int n) {
		if(n==0)return 1;
		return n*fact(n-1);
	}
	
	
	public static void main(String[] args) {
		
		FactorialWithReturn obj=new FactorialWithReturn();
		System.out.print(obj.fact(10));
	}
	
	
}
