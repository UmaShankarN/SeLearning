package week1;

import java.util.Scanner;

public class Factorial2Forloop {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int a = input.nextInt();
		int i, f = 1;
		if (a==0)
		{
			System.out.println("The Factorial of 0 is 1");
		}
		else
		 {
			for(i=1; i<=a; i++)
		   {
			f=f*i;
		   }
		System.out.println("The Factorial of "+a+" is "+f);
   		 }
		}

}
