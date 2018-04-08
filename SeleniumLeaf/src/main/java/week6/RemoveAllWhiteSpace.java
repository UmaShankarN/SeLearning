package week6;

import java.util.Scanner;

public class RemoveAllWhiteSpace {

	public static void main(String[] args) 
	{
		//write a java program to remove all white spaces from the given string
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		//String in = " Rahul  Na  mbira ";
				System.out.println(input.replace(" ", ""));
				
				System.out.println(input.replaceAll(" ", ""));
	}

}
