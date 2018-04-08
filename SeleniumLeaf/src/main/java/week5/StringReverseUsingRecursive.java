package week5;

import java.util.Scanner;

public class StringReverseUsingRecursive {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		stringreverseRecursive(input);
		in.close();
	}

	public static void stringreverseRecursive(String input)
	{
		if(input==null || input.length() <=1)
		{
			System.out.println(input);
		}
		else
		{
			System.out.print(input.charAt(input.length()-1));
			stringreverseRecursive(input.substring(0, input.length()-1));
		}
	}
	
}
