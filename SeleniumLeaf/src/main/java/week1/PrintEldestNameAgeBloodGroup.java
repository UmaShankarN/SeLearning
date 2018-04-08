package week1;

import java.util.Scanner;

public class PrintEldestNameAgeBloodGroup 
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
		int i=0;
		while(i<count)
		{
			System.out.println("Your Name is:"+personName[i]);
			System.out.println("Your Age is:"+personAge[i]);
			System.out.println("Your Blood Group is:"+personBlood[i]);
			i++;
		}
		int oldestAge=0;
		String oldestPersonAge= personAge[0];
		for(i=0;i<count; i++)
		{
			if(Integer.parseInt(personAge[i]) > Integer.parseInt(oldestPersonAge))
			{
				oldestPersonAge= personAge[i];
				oldestAge=i;
			}
			System.out.println("Your Name is:"+personName[i]);
			System.out.println("Your Age is:"+personAge[i]);
			System.out.println("Your Blood Group is:"+personBlood[i]);
		}
		
		
		
	}
 }
