package com.sunil.practice;

import java.util.*;

//class Dog implements Comparator<Dog>, Comparable<Dog>{

	class Dog implements Comparable<Dog>{

	
	   private String name;
	   private int age;
	   
	   Dog(){
	   }

	   Dog(String n, int a){
	     super();
		   name = n;
	      age = a;
	   }

	   public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	   // Overriding the compareTo method
	   /*public int compareTo(Dog d){
	      return (this.name).compareTo(d.name);
	   }*/

	   // Overriding the compare method to sort the age 
	   public int compareTo(Dog d){
	      return -(this.age - d.age);
	   }
	      
	   public static Comparator<Dog> DogComparator = new Comparator<Dog>() {
		   	public int compare(Dog dog1, Dog dog2) {
				
				String name1 = dog1.getName().toUpperCase();
				String name2 = dog2.getName().toUpperCase();
				
				//ascending order
				return name1.compareTo(name2);
				
				//descending order
				//return fruitName2.compareTo(fruitName1);
		   	}   
	   
	   };	   
	}

public class SortExample {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		List<Dog> list = new ArrayList<Dog>();

	      list.add(new Dog("E",3));
	      list.add(new Dog("A",2));
	      list.add(new Dog("D",10));
	      list.add(new Dog("C",4));
	      list.add(new Dog("B",1));
	      Collections.sort(list);// Sorts the array list
	      
	     Collections.sort(list, Dog.DogComparator);

	      for(Dog a: list){//printing the sorted list of names
	         System.out.print(a.getName() + ", ");
	         System.out.print(a.getAge() + ", ");
	      }
		
		/*List<Integer> list1 = new ArrayList<Integer>();

	      list1.add(5);
	      list1.add(1);
	      list1.add(20);
	      list1.add(7);
	      
	      Collections.sort(list);// Sorts the array list

	      for(Integer i: list1)//printing the sorted list of names
	         System.out.println(i.intValue());*/	
	}

}
