package week7;

import java.util.Scanner;

public class PatternLikeAStarOct4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = in.nextInt();
		while(a%2==0)
		{
			System.out.println("The given input is even cannot print the pattern, please try with odd number");
			a = in.nextInt();
		}
		
		System.out.println("Pattern is: ");
		
		if(a%2!= 0)
		{
		int space=(a/2);
		int number = 1;
		for(int k=0; k<(a/2)+1; k++)
			{
				for(int i=0; i<space;i++)
				{
				System.out.print(" ");
				}
				for(int j=1; j<=number;j++)
				{
				System.out.print(j);
				}
				System.out.println();
				space = space-1;
				number = number+2;
			}
		space = 1;
		number = a-2;
		for(int k=0; k<=(a/2)-1;k++)
			{
				for(int i=0;i<space;i++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=number;j++)
				{
					System.out.print(j);
				}
				System.out.println();
				space = space+1;
				number = number-2;
			}
		
		}
		in.close();
		
	}
	
}
