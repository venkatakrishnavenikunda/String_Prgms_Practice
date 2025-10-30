package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class Sample {
	public static void main(String[] args) {
		String str="welcometojava";
		int len=str.length();
		ArrayList< String> list=new ArrayList<String>();
		for(int i=0;i<len-2;i++) {
			String res="";
			for(int j=0;j<3;j++)
			{
				res+=str.charAt(j);
			}
			list.add(res);
			str=str.substring(1,str.length());
			}
		
		Collections.sort(list);
		//System.out.println(list);
		System.out.println("the first element - "+list.get(0));
		System.out.println("the last element -"+ list.get(list.size()-1));
	}

}
