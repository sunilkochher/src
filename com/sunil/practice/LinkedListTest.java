package com.sunil.practice;

import java.util.LinkedList;

public class LinkedListTest {
		  
	    private LinkedList ll;
	    
	    public LinkedListTest(){
	  
	    	ll=new LinkedList();
	    	
	    }
	      
	    public void add(int a){
	    	if (ll==null)
	    		ll.addFirst(new Integer(a));
	    	else
	    		ll.add(new Integer(a));
	    	
	    	System.out.println ("added..."+ a);
	    	System.out.println ("list..."+ ll.toString());
	    }
	      
	    public void traverse(){
	          
	        
	    }
	     
	    public void reverse(){
	        
	    }
	     
	    public static void main(String a[]){
	    	LinkedListTest sl = new LinkedListTest();
	        sl.add(3);
	        sl.add(4);
	        sl.add(5);
	        sl.add(6);
	        sl.add(7);
	        sl.add(8);
	}
	  
	/*class Node<T> implements Comparable<T> {
	      
	    private T value;
	    private Node<T> nextRef;
	      
	    public T getValue() {
	        return value;
	    }
	    public void setValue(T value) {
	        this.value = value;
	    }
	    public Node<T> getNextRef() {
	        return nextRef;
	    }
	    public void setNextRef(Node<T> ref) {
	        this.nextRef = ref;
	    }
	    @Override
	    public int compareTo(T arg) {
	        if(arg == this.value){
	            return 0;
	        } else {
	            return 1;
	        }
	    }*/

}
