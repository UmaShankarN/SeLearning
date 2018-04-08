package week1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = input.nextInt();
		int check=0, q, l;
		q=a/2;
		for(l=2; l<=q; l++)
		{
			if(a%2 == 0)
			{
				System.out.println("Number is not a prime number");
				check=1;
				break;
			}	
		}
		
		if (check==0)
			System.out.println("Number is Prime");
	}

}
