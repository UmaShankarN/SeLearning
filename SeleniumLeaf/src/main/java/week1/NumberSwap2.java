package week1;

import java.util.Scanner;

public class NumberSwap2 
{
	public static void main(String[] args) 
	{
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter two numbers: A=");
		  int n1=input.nextInt();
		  System.out.print("B=");
		  int n2=input.nextInt();
		  n1= n1*n2;
		  n2=n1/n2;
		  n1=n1/n2;
		  System.out.println("After Swapping:A="+n1+" B="+n2);
	}

}
