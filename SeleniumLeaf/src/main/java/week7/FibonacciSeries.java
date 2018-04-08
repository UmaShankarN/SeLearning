package week7;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		// Write a Java Program for Fibonacci Series
		int n1=0,n2=1,n3=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the upper limit: ");
		int upperLimit = in.nextInt();
		
		System.out.print(n1 + "," +n2);
		while(n3<upperLimit)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(n3<upperLimit)
			{
			System.out.print("," +n3);
			}
		}

	}

}
