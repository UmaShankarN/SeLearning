package week6;

import java.util.Scanner;

public class VerifyStringHas5Digits {

	public static void main(String[] args) 
	{
		//String input = "123.45";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String to check the number of digits: ");
		String input = in.nextLine();
		
		int count =0;
		
		for(char i:input.toCharArray())
		{
			count++;
		}
			
		if(count == 5)
		{
			//System.out.println("The given string has 5 digits");
			System.out.println("True");
		}
		else
		{
			//System.out.println("The given string doesn't have 5 digits");
			System.out.println("False");
		}
		in.close();
	}

}
