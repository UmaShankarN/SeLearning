package week6;

import java.util.Scanner;

public class UniqueCharacterCount {

	public static void main(String[] args) 
	{
		//String in = "Chararararar".toLowerCase(); 
		Scanner input = new Scanner(System.in);
		String in = input.nextLine().toLowerCase();
		//System.out.println(in);
		String unique = "";
		
//		for(int i=0;i<in.length();i++)
//		{
//			for(int j=i+1; j<in.length();j++)
//			{
//				if(unique.indexOf(in.charAt(i))==-1)
//				{
//					unique = unique+in.charAt(i);
//				}
//			}
//		}
		
		for(int i=0;i<in.length();i++)
		{
			for(int j=i+1; j<in.length();j++)
			{
				if(unique.contains(String.valueOf(in.charAt(i))))
				{
					
				}
				else
				{
					unique =unique+in.charAt(i);
				}
			}
		}
		
		System.out.println("The unique characters in the string are: "+unique);
		System.out.println("The count of unique characters in the given string are : " +unique.length());
	}

}
