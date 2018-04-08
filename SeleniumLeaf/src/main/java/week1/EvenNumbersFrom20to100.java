package week1;

import java.util.Scanner;

public class EvenNumbersFrom20to100 {

	public static void main(String[] args)
	{
		System.out.println("The Even numbers from 20 to 100 are: ");
//		for(int i=20; i<=100; i++)
//		{
//			if(i%2==0)
//			{
//				System.out.print(i+"\t");
//			}
//		}
		
		int i=20;
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
			}
			
			i++;
		}
	}

}
