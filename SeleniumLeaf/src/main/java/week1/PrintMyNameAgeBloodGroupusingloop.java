package week1;

import java.util.Scanner;

public class PrintMyNameAgeBloodGroupusingloop 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of  persons:");
		int count = input.nextInt();
		input.nextLine();
		String[] personName=new String[count];
		String[] personAge=new String[count];
		String[] personBlood=new String[count];
		
		for(int i=0;i<count;i++)
		{
			System.out.print("Enter your Name:");
			personName[i]=input.nextLine();
			System.out.print("Enter your Age:");
			personAge[i]= input.nextLine();
			System.out.print("Enter your Blood Group:");
			personBlood[i]=input.nextLine();
		}
			int j=0;
		while(j<count)
		{
			System.out.println("Your Name is:"+personName[j]);
			System.out.println("Your Age is:"+personAge[j]);
			System.out.println("Your Blood Group is:"+personBlood[j]);
			j++;
		}
		input.close();
	}
 }
