package week7;

import java.util.Scanner;

public class PrintEachCharacter {

	public static void main(String[] args) 
	{
		//1.Write a Java Program for print each character in newline in a given string
		//Try 1
		String inputName = "Uma Shankar";
		for(int i=0;i<inputName.length(); i++)
		{
			System.out.println(inputName.charAt(i));
		}
		
		//Try 2
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String givenName= in.nextLine();
		char[] nameArray = givenName.toCharArray();
		for(int i=0; i<nameArray.length;i++)
		{
			System.out.println(nameArray[i]);
		}
		
	}

}
