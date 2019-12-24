package com.recursion.org;

public class FibonnaciWithReturn {
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
	// Find 4th fibanocci number, n=4
	private int fib(int n) {
		// TODO Auto-generated method stub
		if (n < 1)
			return -1;
		else if (n == 1 | n == 2)
			return n - 1;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {

		FibonnaciWithReturn obj=new FibonnaciWithReturn();
		System.out.println(obj.fib(4));
	}

}
