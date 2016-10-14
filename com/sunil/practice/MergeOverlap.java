package com.sunil.practice;

import java.util.ArrayList;
import java.util.List;

public class MergeOverlap {

	/*
	 * public static void merge(List l) {
	 * 
	 * List tmpL = new ArrayList(); boolean flag = true;
	 * 
	 * int counter=0;
	 * 
	 * while (counter<2) { counter++; Utils.print("*********l.size="+l.size());
	 * 
	 * for (int i = 0; i < l.size()-1; i++) { int[] curr = (int[]) l.get(i);
	 * int[] next = (int[]) l.get(i + 1); //flag=false;
	 * 
	 * Utils.print("curr[0]="+curr[0]+" curr[1]="+curr[1]+" next[0]="+next[0]
	 * +" next[1]="+next[1]);
	 * 
	 * if (curr[0] < next[0] && next[0] < curr[1] && curr[1] < next[1]) {//{ 1,
	 * 6 };{ 3, 10 }{ 7, 20 }{ 40, 100 } Utils.print("in if flag");
	 * //Utils.print("in if curr[0]="+curr[0]+" next[1]="+next[1]);
	 * 
	 * int[] newArry = new int[] { curr[0], next[1] }; l.remove(i); l.remove(i);
	 * l.add(newArry); //flag=true; } else if (next[0] < curr[0] &&
	 * next[1]>curr[0] && curr[1] > next[1]) {//{ 3, 10 };{ 1, 6 }{ 7, 20 }{ 40,
	 * 100 } Utils.print("in else flag");
	 * //Utils.print("in else if next[0]="+next[0]+" curr[1]="+curr[1]);
	 * 
	 * int[] newArry = new int[] { next[0], curr[1] }; l.remove(i); l.remove(i);
	 * l.add(newArry); //flag=true; }/*else{ Utils.print("in else ");
	 * 
	 * tmpL.add(next); } } //l=tmpL; Utils.print("l.size="+l.size()); //tmpL =
	 * new ArrayList();; }
	 * 
	 * printList(l);
	 * 
	 * }
	 */

	public static void merge(List<int[]> l) {

		// List <int[]> tmpL = new ArrayList<int[]>();
		boolean flag = true;

		// int counter=0;

		while (flag) {
			// counter++;
			flag = false;
			
			for (int i = 0; i < l.size()-1; i++) {
				Utils.print(""+l.size());
				for (int j = i+1; j < l.size(); j++) {
					int[] c = l.get(i);
					int[] n = l.get(j);

					Utils.print(c[0]+" " + c[1] +" "+ n[0] +" "+ n[1]);
					
					if (c[0] == n[0] && c[1] == n[1]) {//(1,15)(1,15)
						Utils.print("*1");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { c[0], c[1] };
						l.add(a);
						flag = true;
						break;
					} else if (c[0] == n[0] && c[1] < n[1]) {//(1,10)(1,15)
						Utils.print("*2");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { c[0], n[1] };
						l.add(a);
						flag = true;
						break;

					} else if (c[0] == n[0] && c[1] > n[1]) {//(1,15)(1,10)
						Utils.print("*3");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { c[0], c[1] };
						l.add(a);
						flag = true;
						break;

					} else if (c[0] < n[0] && n[0]<c[1] && c[1] == n[1]) { //(1,15)(3, 15)
						Utils.print("*4");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { c[0], c[1] };
						l.add(a);
						flag = true;				
						break;

					} else if (c[0] > n[0] && c[1] == n[1]) {//(3,15)(1, 15)
						Utils.print("*5");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { n[0], n[1] };
						l.add(a);
						flag = true;
						break;

					} else if (c[0] < n[0] && c[1] < n[1] && n[0] < c[1]) {//(1,10)(3, 15)
						Utils.print("*6");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { c[0], n[1] };
						l.add(a);
						flag = true;
						break;

					}
					
					
					else if (c[0] > n[0] && c[1] > n[1] && c[0]<n[1]) {//(3,15)(1, 10)
						Utils.print("*7");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { n[0], c[1] };
						l.add(a);
						flag = true;
						break;
					}
					else if (c[0]>n[0] && c[1]<n[1] && c[0]<n[1]) { //(3,10) (1,15)
						Utils.print("*8");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { n[0], n[1] };
						l.add(a);
						flag = true;
						break;
					}else if (c[0]<n[0] && c[1]>n[1]) { //(1,15) (3,10)
						Utils.print("*9");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { c[0], c[1] };
						l.add(a);
						flag = true;
						break;
					}else if (c[0]>n[0] && c[1]<n[1]) { // (3,10) (1,15)
						Utils.print("*9");
						l.remove(i);
						l.remove(j - 1);
						int[] a = new int[] { n[0], n[1] };
						l.add(a);
						flag = true;
						break;
					}

				}
				//if(flag)break;
			}
		}
		
		Utils.print("");
		Utils.print("");
		
		
		printList(l);

	}

	public static void main(String[] args) {
		
		/*int[] a1 = new int[] { 7, 10 };
		int[] a2 = new int[] { 1, 15 };
		int[] a3 = new int[] { 15, 25 };
		int[] a4 = new int[] { 30, 40 };
		int[] a5 = new int[] { 1, 100 };
		int[] a6 = new int[] { 99, 1000 };*/

		List<int[]> l1 = new ArrayList<int[]>();
		
		l1.add(new int[] { 0, 10 });
		l1.add(new int[] { 10, 20 });
		l1.add(new int[] { 20, 30 });
		l1.add(new int[] { 30, 40 });
		l1.add(new int[] { 40, 50 });
		l1.add(new int[] { 50, 60});
		

		
		merge(l1);
	}

	public static void printList(List<int[]> l) {

		for (int i = 0; i < l.size(); i++) {
			int[] curr = (int[]) l.get(i);
			System.out.println(curr[0] + "   " + curr[1]);

		}

	}

}
