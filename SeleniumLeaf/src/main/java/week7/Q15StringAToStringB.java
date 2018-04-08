package week7;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q15StringAToStringB {

	public static void main(String[] args) {
	/*Write a Java Program the sequence of characters in the given String A is in the same order for String B
	Given data: String A --> "tvw"
	String B---> "I am ready to atttend interview"
	In this case the order of t-->v-->w is correct in both String*/
	String a = "etv";
	String b ="I am ready to attend interview";
	System.out.println(b.replaceAll("[^"+a+"]", ""));
	String afterReplace = b.replaceAll("[^"+a+"]", "");
	Set<Character> removeDuplicateCharacter = new LinkedHashSet<>();
		for(int i =0; i<afterReplace.length();i++)
		{
		removeDuplicateCharacter.add(afterReplace.charAt(i));
		}
	System.out.println(removeDuplicateCharacter);
	int j=0, count =0;
	for (char eachCharacter : removeDuplicateCharacter)
	{
		
		if(eachCharacter == a.charAt(j) )
		{
			count++;
		}
		j++;
	}
	if(count == removeDuplicateCharacter.size())
	{
		System.out.println("Matches");
	}
	else
	{
		System.out.println("Not Matches");
	}
	
	
	}

}
