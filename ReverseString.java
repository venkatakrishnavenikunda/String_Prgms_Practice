package Strings;
//
//public class ReverseString {
//	public static void main(String[] args) {
//		System.out.println("Enter a string:");
//		Scanner sc=
//		String str=
//	}
//}



import java.util.Scanner;

public class ReverseString {
    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        while(true){
            if(a.length()!=b.length())
            return false;
            if(a.length()==0 && b.length()==0)
            return true;
        char ch=a.charAt(0);
        a=a.replace(ch+"","");
        b=b.replace(ch+"","");
    }
    }
    public static void main(String[] args) {
    	 System.out.println("Enter two Strings:");
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        boolean res = isAnagram(a, b);
        System.out.println( (res) ? "Anagrams" : "Not Anagrams" );
    }
}