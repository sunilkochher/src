package com.sunil.practice;

public class BinaryTree {
static Node root;
	
public static void addNode(int key, String name){
	
	Node newNode=new Node(key,name);
	
	//System.out.println("root="+root);

	if (root==null) {
		root=newNode;
		return;
		
	}

	//Node parent=root;
	Node currentNode=root;
	boolean flag=true;
		
		while(flag){
			//System.out.println("entered while current Node="+currentNode);
	
			//System.out.println("currentNode.key="+currentNode.key+"  newNode.key "+newNode.key);

			if(newNode.key<currentNode.key){
				///System.out.println("in if "+currentNode.left);
	
				if (currentNode.left==null) {
					currentNode.left=newNode; flag=false;
					//System.out.println("entered in 2nd if");
					}else{
						currentNode=currentNode.left;
					}
					
			}
			else{
					//System.out.println("in else");
					if (currentNode.right==null) { 
						currentNode.right=newNode;currentNode=currentNode.right;	flag=false;
						}else{
							currentNode=currentNode.right;
						}
				}
			//System.out.println("here1");
		}	
}	

public static void traverseBinary(Node currentNode){
	if (currentNode==null){
		//System.out.println("no nodes found");
		return;
	}
	
	System.out.println(currentNode);
	traverseBinary(currentNode.left);
	traverseBinary(currentNode.right);

	
}

public static int depth(Node currentNode, int count){
	if (currentNode!=null){
	
	count=1+depth(currentNode.left, count);
	//count=1+depth(currentNode.right,count);
	}
	return count;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree.addNode(4,"A");
		BinaryTree.addNode(3,"B");
		BinaryTree.addNode(2,"C");
		BinaryTree.addNode(5,"D");
		BinaryTree.addNode(6,"E");
		//BinaryTree.addNode(8,"F");
		//BinaryTree.addNode(9,"G");
		
		System.out.println(depth(root,0));
				
		//BinaryTree.traverseBinary(root.left);
		
	}

}

class Node{
	int key;
	String name;
	Node left;
	Node right;
	
	Node(int k, String n){
		this.key=k;
		this.name=n;	
	}
	
	public String toString(){
		
		return key+","+name;
		
	}
	
}
