package week6;

import java.util.Scanner;

public class FindingPerfectNumber {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int inputNumber =  in.nextInt();
		int temp=0;
		for(int i=1;i<inputNumber;i++)
		{
			if(inputNumber%i == 0)
			{
			temp = temp+i;
			//System.out.println(temp);
			}
		}
		if(temp==inputNumber)
		{
			System.out.println("The Given number " +inputNumber+" is a Perfect Number.");
		}
		else
		{
			System.out.println("The Given number " +inputNumber+" is not a Perfect Number.");
		}
	in.close();
	}
	

}
