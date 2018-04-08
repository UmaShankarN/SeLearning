package week6; 

import java.util.Scanner;

public class FindRepeatingCharUsingSplit {

	public static void main(String[] args)
	{
		//Method 1: Using Split method but it wont work when the character is at end of the string
		/*String cName = "Cognizant India";
		System.out.println("Enter the character: ");
		Scanner in = new Scanner(System.in);
		String inputCharacter = in.next();
		String[] afterSplit = cName.split(inputCharacter);
		System.out.println(inputCharacter + " repeats " + (afterSplit.length-1) +" times"); */
		
		//Method 2: Using For each loop and if condition
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String cName = in.nextLine();
		System.out.println("Enter the character: ");
		char inputCharacter = in.next().charAt(0);
		int count =0;
		char[] cNameArray= cName.toCharArray();
		for(char c:cNameArray)
		{
			if(c==inputCharacter)
			{
				count++;
			}
		}
		
		System.out.println("The input string is " + cName+ " And the input Character " +inputCharacter + " repeats " + count +" times");
		
		//Method 3: Using replaceAll and length methods
		
		
		
	}

}
