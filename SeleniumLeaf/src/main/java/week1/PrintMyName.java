package week1;

import java.util.Scanner;

public class PrintMyName 
{
	public static void main(String[] args)
	{
     //System.out.println("Uma Shankar");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=input.next();
		System.out.println("Your Name is:"+name);
	}
 }
