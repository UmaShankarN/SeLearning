package week1;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = input.nextInt();
		int b=a/2;
		while(a>=b)
		{
			if(a==2)
			{
				System.out.println("2 is a prime numnber");
				break;
			}
			
			else if(b%2==0) //change to b
			{
				System.out.println(+a+" is not a prime number");
				break;
			}
			else
			{
				System.out.println(+a+" is a prime number");
				break;
			}
		}

	}

}
