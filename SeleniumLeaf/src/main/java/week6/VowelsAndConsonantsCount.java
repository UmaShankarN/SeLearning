package week6;

import java.util.Scanner;

public class VowelsAndConsonantsCount {

	public static void main(String[] args) 
	{
		//write a java program to count number of vowels and consonants in a given string
		//String input = "Ce[{ leb";
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = in.nextLine();
		
		int vowelsCount =0;
		int consonantCount =0;
		for(int i =0; i<input.length();i++)
		{
			if(((int)input.charAt(i)>=65 && (int)input.charAt(i) <91)||((int)input.charAt(i)>=97 && (int)input.charAt(i) <123))	
					{
					 if(input.charAt(i)=='a' || input.charAt(i)=='e'|| input.charAt(i)=='i'||input.charAt(i)=='o'|| input.charAt(i)=='u'
							 ||input.charAt(i)=='A' ||input.charAt(i)=='E' ||input.charAt(i)=='I' ||input.charAt(i)=='O' ||input.charAt(i)=='U')
					 	{
						 //System.out.println("Vowels " + input.charAt(i));
						 vowelsCount++;
					 	}
					 else
					 	{
						//System.out.println("Consonants " + input.charAt(i)); 
						consonantCount++;
					 	} 
					}
		}
		
		System.out.println("Vowels Count: " + vowelsCount);
		System.out.println("Consonant Count: " +consonantCount);
		in.close();
	}
}

