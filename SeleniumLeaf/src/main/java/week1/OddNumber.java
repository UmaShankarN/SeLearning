package week1;

import java.util.Scanner;

public class OddNumber 
   {
	public static void main(String[] args)
	   {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int a= input.nextInt();
		System.out.println("Given number is " +a);
		if(a%2==0)
				 System.out.println("Number " +a+ " is Even");
   	    else
				 System.out.println("Number " +a+ " is Odd");
	   }
	}	