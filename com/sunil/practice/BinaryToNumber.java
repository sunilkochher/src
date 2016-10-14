package com.sunil.practice;

public class BinaryToNumber {

	public static void main(String[] args) {
		BinaryToNumber dtb = new BinaryToNumber();
        dtb.printBinaryFormat(4);
	}
	
	public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            System.out.println(number+"     "+binary[index]);
            number = number/2;
        }
        
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

}
