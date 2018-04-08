package week6;

import java.util.Scanner;

public class ProgramToRemoveWhiteSpaces {

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = in.nextLine();
		//String inputString = "aa bbbb   ccc ";
		//System.out.println(inputString.replaceAll("\\s+", "1").trim());
		System.out.println(inputString.replaceAll("( )+", " ").trim());
		//System.out.println(inputString);
		in.close();
	}

}
