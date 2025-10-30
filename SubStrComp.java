package Strings;

import java.util.Scanner;

public class SubStrComp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scan.nextLine();
        System.out.println("Enter a number:");
        int k = scan.nextInt();
        System.out.println(s);
        System.out.println(getSmallestAndLargest(s, k));
    }
	    public static String getSmallestAndLargest(String s, int k) {
	       String smallest = s.substring(0, k);
	       String largest = s.substring(0, k);
	       for (int i = 1; i <= s.length() - k; i++) {
	        String str = s.substring(i, i + k);
	        if (smallest.compareTo(str) > 0) {
	            smallest = str;
	            }
	        if (largest.compareTo(str) < 0) {
	            largest = str;
	        }
	        }
	        return smallest + "\n" + largest;
	    }
	}



//Another way to slove the program
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Sample {
//	public static void main(String[] args) {
//		String str="welcometojava";
//		int len=str.length();
//		ArrayList< String> list=new ArrayList<String>();
//		for(int i=0;i<len-2;i++) {
//			String res="";
//			for(int j=0;j<3;j++)
//			{
//				res+=str.charAt(j);
//			}
//			list.add(res);
//			str=str.substring(1,str.length());
//			}
//		
//		Collections.sort(list);
//		System.out.println("the first element - "+list.get(0));
//		System.out.println("the last element -"+ list.get(list.size()-1));
//	}
//
//}

