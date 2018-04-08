package week7;

import java.util.Scanner;

public class UserInputToRegEx {

	public static void main(String[] args) 
	{
		/*Get a character input from user at run time 
		and pass the value to the RegEx to replace the character in  string*/
		
		Scanner in = new Scanner(System.in);
		String inputCharacter = in.next();
		String inputString = "Hello World";
		String inputString1 = "Rs. 7,565";
		//I want to get the input from user as 'l' and replace 'l' in the given string
		System.out.println(inputString.replaceAll("["+ "A-Z" + "]", inputCharacter));
		System.out.println(inputString1.replaceAll("[Rs.,]", "").trim());
		//System.out.println(inputString.replaceAll("["+ inputCharacter +"]+", ""));
	}

}
