package week7;

import java.util.Scanner;

public class OneTo999InWords {

	public static void main(String[] args) {
		// Write a Java Program to print the word for the given number
		String[] num1 ={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
						"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
						"Eighteen","Nineteen"};
		
		String[] num2 ={"", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty" ,"Ninety"};
		
		String[] num3={"", "One Hundred" , "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred",
						"Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int inputNumber = in.nextInt();
		in.close();
		if(inputNumber<20)
		{
		System.out.print("The number "+inputNumber+" in words is: ");
		System.out.println(num1[inputNumber]);
		}
		
		if(inputNumber>19 && inputNumber <100)
		{
			System.out.print("The number "+inputNumber+" in words is: ");
			System.out.print(num2[inputNumber/10]);
			if(inputNumber%10 != 0)
			{
				System.out.println(" "+num1[inputNumber%10]);
			}
		}
		
		if(inputNumber>99)
		{
			System.out.print("The number "+inputNumber+" in words is: ");
			System.out.print(num3[inputNumber/100]+" and ");
			if(inputNumber%100 != 0  && inputNumber%100 <=19)
			{
				System.out.println(num1[inputNumber%100]);
			}
			
			if(inputNumber%100 != 0 && inputNumber%100 >19 )
			{
				int reminder = inputNumber%100;		
				System.out.print(num2[reminder/10]+ " " );
				if(reminder%10 != 0)
				{
					System.out.println(num1[reminder%10]);
				}
			}
			
		}
		
	}

}
