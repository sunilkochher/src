package com.sunil.practice;

import java.util.ArrayList;
import java.util.List;

public class TestSum {

	 static void insertionSort(int[] a){
		
		int[] result=new int[a.length];
		int num=100;
		int counter=0;
		
		while(a.length>0){			
			//System.out.println("***entered while="+a.length);//1,3,4,5,2
				
			for(int i=0;i<a.length;i++){	
			//System.out.println("***"+a[i]);
				
				//System.out.println("***a[i]="+a[i]);
				
				if(i==0){
					
					num=a[i]; continue;
				
				}
				
				if(a[i]<num){
					num=a[i];
				}
				
			}
			//System.out.println("*******num ="+num);
			
			if(a.length==1){
				result[counter]=num;
				break;
			}

			a=getNewArray(a, num);
			//System.out.println("***"+a.length);

			result[counter]=num;
			counter++;

			
		}
		
		printArray(result);
	
	}
	
	 static int[] getNewArray(int[] a, int number){
		 
		//if (a.length==1) return a;
		 int[] tmp=new int[a.length-1];

		 int counter=0;
		 
		 for(int i=0;i<a.length;i++){
			 if(a[i]==number) continue;
			 tmp[counter]=a[i];
			 counter++;
		 }
		 
		 return tmp;
		 
	 }
	 
	
	 static void printArray(int[] a){
		 
		 for(int i=0;i<a.length;i++){
			 
			 System.out.println(a[i]);
			 
		 }
		 
	 }
	 
	static void sum(int number){
		
		System.out.println(number%10);
		System.out.println(number/10);
		
	}
	
	public static void main(String[] args) {
		//sum(11987682);
		int aa[]=new int[] {1,3,5,4,2,100,99,6,34,43,25,66,88,54,56,90};
		insertionSort(aa);
	}

}
