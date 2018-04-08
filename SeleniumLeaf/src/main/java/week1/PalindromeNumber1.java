package week1;

import java.util.Scanner;

public class PalindromeNumber1 
{
	public static void main(String[] args) 
	{
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the number to check if it is Palindrome or not:");
	 int n1=input.nextInt();
	 int n2, n3, rev=0;
	 n3=n1;
	 while(n1>0)
	 {
		 n2=n1%10;
		 rev=(rev*10)+n2;
		 n1=n1/10;
	 }
	 System.out.println("The given number is:" +n3);
	 System.out.println("Reverse of n1 is:" +rev);
	 if(rev==n3)
		 System.out.println("The given number is a Palindrome");
	 else
		 System.out.println("The given number is not a Palindrome");

	}

}
