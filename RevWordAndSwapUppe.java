package Strings;

import java.util.Scanner;

public class RevWordAndSwapUppe {
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev="";
		str=str.trim().replaceAll("\\s+"," ");
		String[] s1=str.split(" ");
		for(String s:s1) {
			//char ch=s.charAt(0);
			//char ch1=s.charAt(s.length()-1);
			//rev=rev +(char)(ch1-32)+s.substring(1,s.length()-1)+(char)(ch-32)+" ";
			
			char ch=(char) (s.charAt(0)-32);
			char ch1=(char) (s.charAt(s.length()-1)-32);
			rev=rev + ch1 +s.substring(1,s.length()-1)+ ch +" ";
		}
		System.out.println(rev);
	}
}
