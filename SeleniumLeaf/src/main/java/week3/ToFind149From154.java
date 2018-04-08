package week3;

import java.util.Scanner;

public class ToFind149From154 {

	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = in.nextInt();
		System.out.println("Enter the digit: ");
		int digit=in.nextInt();
		String givenDigit= Integer.toString(digit);
		for(int i = input;i<=input;i--)
		{
			if (Integer.toString(i).contains(givenDigit))
			{
			continue;
			}
			else
			{
			System.out.println(i);
			break;
			}
		}
		
		in.close();

	}

}
