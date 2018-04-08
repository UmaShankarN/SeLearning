package week6;

import java.util.Scanner;

public class PrintDuplicateCharFromString {

	public static void main(String[] args) 
	{
		// Write a java program to print duplicate character from the given string
		Scanner in = new Scanner(System.in);
		String input = in.nextLine().toLowerCase();
		//String input = "chararararccchw";
		int count =0;
		String temp ="";
		//System.out.println(input.indexOf("k"));
		for(int i=0; i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				if(input.charAt(i) == input.charAt(j))
						{
					count++;
						}
			}
			if(count>=1 && (!temp.contains(String.valueOf(input.charAt(i)))))
			{
				temp = temp + input.charAt(i);
				System.out.print(input.charAt(i));
			}
			count=0;
		}
		
		
		
		

	}
}


