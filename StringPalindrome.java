package Strings;

public class StringPalindrome {
	   public static void main(String[] args) {
	        String s="Madam";
	        if(isPalindrome(s))
	        System.out.println("palindrome");
	        else
	        System.out.println("Not palidrome");
	    }
	    public static boolean isPalindrome(String s){
	        s=s.toLowerCase();
	        int i=0;
	        int j=s.length()-1;
	        while(i<j){
	            if(s.charAt(i)!=s.charAt(j))
	            return false;
	            i++;
	            j--;
	        }
	        return true;
	    }
}
