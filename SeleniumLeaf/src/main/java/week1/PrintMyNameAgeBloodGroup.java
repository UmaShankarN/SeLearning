package week1;

import java.util.Scanner;

public class PrintMyNameAgeBloodGroup 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Name:");
		String myName=input.nextLine();
		System.out.print("Enter your Age:");
		String myAge= input.nextLine();
		System.out.print("Enter your Blood Group:");
		String myBlood=input.nextLine();
		
		System.out.print("Enter your Father's Name:");
		String myFname=input.nextLine();
		System.out.print("Enter your Father's Age:");
		String myFage= input.nextLine();
		System.out.print("Enter your Father's Blood Group:");
		String myFblood=input.nextLine();
		
		System.out.print("Enter your Wife's Name:");
		String myWname=input.nextLine();
		System.out.print("Enter your Wife's Age:");
		String myWage= input.nextLine();
		System.out.print("Enter your Wife's Blood Group:");
		String myWblood=input.nextLine();
		
		System.out.println("Your Name is:"+myName);
		System.out.println("Your Age is:"+myAge);
		System.out.println("Your Blood Group is:"+myBlood);
		System.out.println("Your Father's Name is:"+myFname);
		System.out.println("Your Father's Age is:"+myFage);
		System.out.println("Your Father's Blood Group is:"+myFblood);
		System.out.println("Your Wife's Name is:"+myWname);
		System.out.println("Your Wife's Age is:"+myWage);
		System.out.println("Your Wife's Blood Group is:"+myWblood);
		input.close();
	}
 }
