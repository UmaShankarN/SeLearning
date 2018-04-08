package week7;

import java.util.Scanner;

public class CharacterOccurence {

	public static void main(String[] args) 
	{
		// Write a program to print the number of occurence of a given character in a String
		String bInput = "I am the winner".toLowerCase();
		Scanner in = new Scanner(System.in);
		String charInput = in.nextLine();
		String aInput = bInput.replace(charInput, "");
		System.out.println(aInput);
		System.out.println(bInput.length()-aInput.length());
	}

}
