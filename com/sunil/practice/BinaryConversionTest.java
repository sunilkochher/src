package com.sunil.practice;

import java.io.*;

public class BinaryConversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        
        try{
        	String s = br.readLine();
            System.out.print("Enter Integer:");
            int i = Integer.parseInt(br.readLine());
        }catch(Exception nfe){
            System.err.println("Invalid Format!");
        }
		
		
		/*String a=binaryToString("0110011");
		
		System.out.println(a);
		
		BufferedInputStream buff=System.in.read();*/
	}
	
	public static String binaryToString(String binary){
		
		char[] charArray=binary.toCharArray();
		int result=0;
		
		for (int i=charArray.length-1;i>=0;i--){
			if(charArray[i]=='1')
			result+=Math.pow(2, charArray.length-i-1);	
		}
		return ""+result;
	}

}
