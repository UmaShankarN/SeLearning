package week1;

import java.util.Scanner;

public class Factorial1WhileLoop {

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a= input.nextInt();
		int i=1, f=1;
		if(a==0)
		{
			System.out.println("The Factorial of 0 is 1");
		}
		else 
		{
			while(i<=a)
			{
				f=f*i;
				i++;
			}
			System.out.println("The Factorial of "+a+" is "+f);
		}
	}

}
