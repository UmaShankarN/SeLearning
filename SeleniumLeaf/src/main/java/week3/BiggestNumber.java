package week3;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the count of numbers: ");
		int count = in.nextInt();
		int[] numbers = new int[count];
		for(int i=0;i<count; i++)
		{
			numbers[i]= in.nextInt();
		}
		 int temp=0;
		for(int i=0; i<count; i++)
		{
			if(temp<numbers[i])
			{
				temp=numbers[i];
			}
		}
		
		System.out.println("The biggest of all numbers is: " +temp);
	}

}
