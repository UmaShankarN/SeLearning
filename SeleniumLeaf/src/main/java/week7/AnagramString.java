package week7;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// write a program to verify the given strings are anagram or not
		String s1= "armwy";
		String s2 = "mary";
		boolean status = true;
		if(s1.length() != s2.length())
		{
			//System.out.println("Not an Anagram");
			status = false;
		}
		else
		{
			char[] s1a= s1.toCharArray();
			char[] s2a= s2.toCharArray();
			Arrays.sort(s1a);
			System.out.println(s1a);
			Arrays.sort(s2a);
			System.out.println(s2a);
			
			if(Arrays.equals(s1a, s2a))
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		if(status)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
	}

}
