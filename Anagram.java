package Strings;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		System.out.println("Enter two Strings:");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(isAnagram(s1,s2))
			System.out.println(s1+" and"+ s2+" are"+" Anagrams");
		else
			System.out.println(s1+" and"+ s2+" are"+" Not anagrams");
	}
	
	public static  boolean isAnagram(String s1, String s2) 
	{
		while(true) {
		if(s1.length()!=s2.length()) 
			return false;
		if(s1.length()==0 && s2.length()==0)
			return true;
		char ch=s1.charAt(0);
		s1=s1.replace(ch+"","");
		s2=s2.replace(ch+"","");
		}
		
	}
}
