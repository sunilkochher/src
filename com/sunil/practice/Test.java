package com.sunil.practice;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.net.PrintCommandListener;

import java.io.*;
import java.util.*;




public class Test {
     static HashMap<String, String> map=null;
     
     
     public static String lookUpDictionary(String word){
    	 if(map==null) return null;
    	 
    	 return map.get(word).toString();
     }
     
     
     public static void addWord(String word, String def){
    	 String completeStr=word+","+def;
    	 
    	 FileWriter fw=null;
    	 BufferedWriter bw = null;
    	 File f=null;

    	 try{
    	  f=new File("/Users/monakochher/Documents/temp/sample.txt");
    	  fw=new FileWriter(f.getAbsoluteFile(), true);
    	  bw = new BufferedWriter(fw);
    	 // bw.append(completeStr.toCharArray())
    	  bw.write("\n"+completeStr);
    	  bw.close();
    	 }catch(IOException ie){
    		 ie.printStackTrace();
    		 
    	 }
    	 
    	 init();
     }
   
     private static void init(){
    	 
    	 BufferedReader br = null;
 		map=new HashMap<String, String>();
 					
 		String[] strArray= null;
 			
 		try {

 			String sCurrentLine;

 			br = new BufferedReader(new FileReader("/Users/monakochher/Documents/temp/sample.txt"));

 			while ((sCurrentLine = br.readLine()) != null) {
 				
 				strArray=sCurrentLine.split(",");
 				//System.out.println(strArray[0]+"  "+strArray[1]);

 				map.put(strArray[0].trim(), strArray[1].trim());
 				//System.out.println(sCurrentLine);
 				strArray=null;
 				
 			}
 			br.close();
 		} catch (IOException e) {
 			e.printStackTrace();
 		} finally {
 			try {
 				if (br != null)br.close();
 			} catch (IOException ex) {
 				ex.printStackTrace();
 			}
 		}
    	 
     }
     
     
     public static int convert_String_To_Number(String numStr){
         
         char ch[] = numStr.toCharArray();
         int sum = 0;
         //get ascii value for zero
         int zeroAscii = (int)'0';
         System.out.println(zeroAscii);
         
         for(char c:ch){
             int tmpAscii = (int)c;
             sum = (sum*10)+(tmpAscii-zeroAscii);
             //sum = (sum*10)+(tmpAscii);

         }
         return sum;
     }
     
    static boolean isOverlap(String s){
    
    	StringTokenizer tokens=new StringTokenizer(s);
    	    	
    	int[] rect1=new int[4];
    	int[] rect2=new int[4];
    	
    	int counter=0;
    	int counter1=0;
    	
    	int num;
    	
    	while(tokens.hasMoreTokens()){
    		
    		num=Integer.parseInt(tokens.nextToken());
    		    		
    		if(counter<=3){
    			rect1[counter]=num;
    		
    		}else{
 
    			rect2[counter1]=num;
        		counter1++;
    		}
    		
    		counter++;
    		
    	}
    	
    
    	
    	
    	return compareValues(rect1, rect2);	
    	
    }
    
  private static boolean compareValues(int[] a, int[] b){
	  
	  boolean flag=false;
	  	  
	  if(a[0]>b[0] && a[1]>b[1] && a[2]<=b[2] && a[3]<=b[3] && b[3]==b[2] )flag=true;
	  
	  return flag;
	  
  }
     
     
	public static void main(String a[]){
    	
	
	//System.out.println(isOverlap(s));
	
		/*(int x, int y) -> x + y /// Lambda examples

		() -> 42

		(String s) -> { System.out.println(s); }*/
		
		
		Runnable r2 = () -> System.out.println("Hello world two!");		
		
		
		r2.run();
		
		
		
		
		
		//System.out.println("\"3256\" == "+convert_String_To_Number("3256"));
		
		//Scanner scan=new Scanner(System.in);
		//String str=scan.nextLine();
		
		//System.out.println (str.substring(2, 3));
		
		
		//init();
  
		//System.out.println("looking up ="+ lookUpDictionary("A"));
    	
		//addWord("III","Jalandhar");
		
		
		//System.out.println("looking up ="+ lookUpDictionary("III"));

    	
    	/*Date today=new Date();
    	
    	Calendar oldDay=new GregorianCalendar();
    	oldDay.setTime(today);
    	oldDay.add(Calendar.DAY_OF_MONTH, -8);
    	Date newDate= oldDay.getTime();
    	
    	Calendar cal=new GregorianCalendar();
    	
    	cal.setTime(today);
    	cal.add(Calendar.DAY_OF_MONTH, -8);
    	
    	//if(today==cal.getTime())
    	
    	System.out.println(cal.getTime().getTime()==oldDay.getTime().getTime());
    	
    	//System.out.println(cal.getTime().getTime());*/
    	
    }
    
    
    private static boolean checkDate(Date txnDate){
    	boolean flag=false;
    	
    	Date today=new Date();
    	Calendar cal=new GregorianCalendar();
    	cal.setTime(today);
    	
    	for(int i=10;i>=1;i--){
    		cal.add(Calendar.DAY_OF_MONTH, i* -1);//check for last ten days
    		if(txnDate==cal.getTime())flag= true;
    		
    	}
    	return flag;
    }
}



	









/*static class Helper {
	        private int data = 5;
	        public void bump(int inc) {
	            inc++;
	            data = data + inc;
	        }
	    }    
	    
	    public static void main(String []args) {
	    	
	    	FileReader inputStream = new FileReader("input.dat");
	    	Helper h = new Helper();
	        int data = 2;
	        h.bump(data);
	        System.out.println(h.data + " " + data);
	    }*/
//}	
	
	
	

	/*public static void main(String[] args) {
		
		int[] a=new int[]{1, 2, 9,11,20};
		
		System.out.println("recursive=" + findMinimumDiff(a));
		
		/*int[] input = { 1, 2, 3, 4, 8, 5, 10, 6 };
		int M = 9;
		StringBuffer sb = new StringBuffer();

		System.out.println("iterative=" + getPairsIterative(input, M));
		System.out.println("recursive=" + getPairsRecursive(input, sb, 0, 0, M));*/
	//}
	
	
	/*private static int findMinimumDiff(int a[]){
		
		List<Integer> l=new ArrayList();
		
		for (int i=0;i<a.length;i++){
			for (int j=i+1;j<=a.length-1;j++){
				l.add(a[i]+a[j]);
			}	
		}
		
		Arrays.sort(a);
		int result=0;
		
		int value1=-1;
		int value2=-1;
		
		for(int i=0;i<l.size();i++){
			if(i==0)continue;	
			value1=l.get(i);
			value2=l.get(i-1);
			result=value2 -value1;
		}
		
		System.out.println ("values="+value2+","+value1);
		
		return result;
	}
	
	
	
	
	
	private static int findLongestPath(int[][] a,int i,int j, int counter) {
		
		System.out.println("i=" + i+"  j="+j+" length="+a.length);

		if(j<a.length && a[i][j]+1==a[i][j+1]){
			System.out.println("in if i=" + i+"  j="+j+" length="+a.length);
			return counter= counter+findLongestPath(a,i,j+1,counter);
		}
		else if(i<a.length && a[i][j]+1==a[i][j+1]){
			System.out.println("else i=" + i+"  j="+j+" length="+a.length);
			j=0;
			return counter= counter+findLongestPath(a,i+1,j,counter);
		}
			
		return 1;
		
	}

	
	
	
	

	private static String getPairsRecursive(int[] a, StringBuffer sb, int loop1, int loop2, int M) {
		if (a.length == 0)
			return null;

		if (loop2 <= a.length - 1) {
			if (a[loop1] + a[loop2] == M) {
				sb.append("(" + a[loop1] + "," + a[loop2] + ")");
			}
			loop2++;
			getPairsRecursive(a, sb, loop1, loop2, M);
		} else if (loop1 < a.length - 1 && loop2 >= a.length) {
			loop1++;
			loop2 = 0;
			getPairsRecursive(a, sb, loop1, loop2, M);
		}

		return sb.toString();
	}

	private static String getPairsIterative(int[] a, int M) {

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] + a[j] == M) {
					sb.append("(" + a[i] + "," + a[j] + ")");
				}
			}
		}
		return sb.toString();
	}

	private static void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void insertionSort(int array[]) {
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int i = j - 1;
			System.out.println("j=" + j + " i=" + i + " array[j]=" + array[j] + " array [i]=" + array[i]
					+ " array [i+1]=" + array[i + 1]);
			;
			while ((i > -1) && (array[i] > array[j])) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = array[j];
		}
	}

}*/
