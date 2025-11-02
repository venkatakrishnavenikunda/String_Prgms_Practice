package Strings;



import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;
//
//public class LonSubstringWithoutRepeating {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a String:");
//		String s=sc.nextLine();
//		System.out.println(longSubStr(s));
//	}
//	
//	public static int longSubStr(String s) {
//		Set<Character> set=new HashSet<>();
//		
//		int left=0;
//		int maxLength=0;
//		
//		for(int right=0; right<s.length();right++) {
//			char ch=s.charAt(right);
//			
//			while(set.contains(ch)) {
//				set.remove(s.charAt(left));
//				left++;
//			}
//			set.add(ch);
//			maxLength=Math.max(maxLength, right-left+1);
//		}
//		return maxLength;
//	}
//}


//Another method to solve the problem 
public class LonSubstringWithoutRepeating{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		System.out.println(longSubStr(s));
	}
	
	public static int longSubStr(String s) {
		String longest="";
		int length=0;
		Map<Character, Integer>m=new LinkedHashMap<>();
		char[] arr=s.toCharArray();
		
		for(int i=0; i<arr.length;i++) {
			char ch=arr[i];
			
			if(!m.containsKey(ch)) {
				m.put(ch, i);
			}
			else {
				i=m.get(ch);
				m.clear();
			}
			
			if(m.size()>length) {
				length=m.size();
				longest=m.keySet().toString();
			}
		}
		
		return length;
		
	}
}