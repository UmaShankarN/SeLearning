package week1;

import java.util.Scanner;

public class Factorial1forloop {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number");
		int a= input.nextInt();
		int f;
		 if(a==0)
		 {
			 System.out.println("The Factorial is 1");
		 }
		 else if(a<0)
		 {
			 System.out.println("Enter positive number");
		 }
		 else 
		 {
			 f=a;
			 for(int i=a-1; i>=1; i--)
			 {
				 f=f*i;
			 }
			 System.out.println("the factorial is "+ f);
		 }
		 

	}

}
