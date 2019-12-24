package com.recursion.org;

public class FactorialOfNum {
	 int  res = 1;
	private  void factorial(int num) {
		// TODO Auto-generated method stub
		
		if (num <= 1) {
			System.out.println(res);
			return;
		}
		res *= num * (num - 1);
		factorial(num - 2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfNum obj=new FactorialOfNum();
		obj.factorial(5);
	}

}
