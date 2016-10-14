package com.sunil.practice;

public class LinkedList {

	static Node1 head;
	
	/*public static void addNode(int d){
		
		Node1 newNode1=new Node1(d);
		
		if(head==null){
			head=newNode1;
			return;
		}
		
		Node1 currentNode=head;
		
		while(true){			
			if(currentNode.next==null) {
				currentNode.next=newNode1;
				return;
			}
			currentNode=currentNode.next;
		}

	}*/
	
	
public static void addNode(int d){
			
	//print("entered");

	Node1 newNode=new Node1(d);
		
		if(head==null){
			head=newNode;
			return;
		}
		
		Node1 currentNode=head.next;
		
		while(true){
			//print("curr="+currentNode+" newNode= "+newNode);
			if (head.next==null){
				//print("in else");
				head.next=newNode;
				currentNode=head.next;
			}else if(currentNode.next==null){
				//print("in else");
				currentNode.next=newNode;
				currentNode=newNode;
			}
			
			if(currentNode.next==null) return;
			currentNode=currentNode.next;
		}
	}

static int size(Node1 node, int size){
	
	if(node==null) return size;
	
	size=1+size(node.next,size);
	
	return size;
}


static void sortList(){
		
	Node1 A=head;
	Node1 B=head.next;
	
	
	Node1 temp=null;
	Node1 temp2=null;
	
	int counter=0;
	while(true){
		counter++;
		
		if(A.data>B.data){
			temp=A;
			temp2=B.next;
			
			A=B;
			B=temp;
			A.next=B;
			B.next=temp2;
			if (counter==1) head=A;
		}
		
		print("A= "+A+" B= "+B);
		
		A=B;
		B=B.next;
		
		print("***A= "+A+" B= "+B);
		if(A.next==null) return;
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				addNode(8);
				addNode(1);
				addNode(4);
				/*addNode(6);
				addNode(3);
				addNode(11);
				addNode(2);
				addNode(5);*/
				
				sortList();
				
				//print(""+size(head,0));
				
				traverse1(head);
	}
	
	static void traverse1(Node1 n){
		//System.out.println("H");

		while(true){
			System.out.println(n.data);
			if (n.next==null) return;
			n=n.next;
			
		}
	}


static void print(String s){
	System.out.println(s);
	
}
}

class Node1{
	int data;
	Node1 next;
	
	Node1(int d){
		data=d;
		next=null;	
	}
	
	public String toString(){
		return ""+data;
		
	}
}
