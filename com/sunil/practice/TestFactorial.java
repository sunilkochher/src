package com.sunil.practice;

public class TestFactorial {

	public static void main(String[] args) {
		System.out.println(callFactorial(5));

	}

	private static int callFactorial(int a){
		int x=1;
		if(a==0) return x;
		x=a* callFactorial(a-1);
		return x;
	}
	
}
