package week2;

import java.util.Scanner;

public class LearnLeapYear1 {

	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		int inputYear = in.nextInt();
		
		 if((inputYear % 400 == 0) || ((inputYear % 4 == 0) && (inputYear % 100 != 0)))
             System.out.println("Year " + inputYear + " is a leap year");
     else
             System.out.println("Year " + inputYear + " is not a leap year");
	}
}
		
//		if(inputYear%4 ==0)
//		{
//			System.out.println("Leap Year");
//		}
//		else if(inputYear%100 == 0)
//		   {
//			if(inputYear%400 == 0)
//			{
//				System.out.println("Leap Year");
//			}
//			else
//			{
//				System.out.println("Not a leap Year)");
//			}
//		   }
//		else
//		{
//			System.out.println("Leap Year");
//		}
//		System.out.println("Not a Leap Year");
//	}
	
		
	


