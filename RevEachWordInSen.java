package Strings;

public class RevEachWordInSen {
	public static void main(String[] args){
        String s=" java    is an oop  ";
        System.out.println("Input:"+s);
         s=s.trim().replaceAll("\\s+"," ");
        System.out.println ("After removing space:"+s);
        String str[]=s.split(" ");
        System.out.println("Output:");
        for(int i=0; i<str.length;i++){
            System.out.print(rev(str[i])+" ");
        }
    }
    
    public static String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}
