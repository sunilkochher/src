package com.sunil.practice;

public class CheckPalindrome {

	public static void checkPalindrome(int number){
		
		int reverse=0;
		String tmp="";
		
		int initialNumber=number;
		
		System.out.println("   Number=     "+number);

		while (number>0){
			reverse=(reverse*0)+number%10;
			number=number/10;
			System.out.println("Reverse=     "+reverse+"       Number=     "+number);
			tmp+=reverse;
		}
		boolean flag=initialNumber==Integer.parseInt(tmp);
		System.out.println(flag+ "    Final reverse    "+tmp+" is a Palidnrome");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPalindrome(122221);

	}

}
