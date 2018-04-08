package week3;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) 
	{
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the number count: ");
	 int count = in.nextInt();
	 int numbers[]=new int[count];
	 
	 for(int i=0;i<count;i++)
	 	{
		 numbers[i]=in.nextInt();
	 	}
	int temp=numbers[0];
	 //System.out.println(temp);
	for(int i=0; i<count; i++)
		{
			if(temp>numbers[i])
			{
		     temp=numbers[i];	
			}
		}
	 System.out.println("The Smallest of all numbers is: " +temp);
	}

}
