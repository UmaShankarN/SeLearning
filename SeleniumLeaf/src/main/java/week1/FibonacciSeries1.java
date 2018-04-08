package week1;

import java.util.Scanner;

public class FibonacciSeries1 {

	public static void main(String[] args) 
	{
		int i=0,j=1,Temp = 0;
		System.out.println("Enter the limit:");
		Scanner input=new Scanner(System.in);
		int limit=input.nextInt();
		System.out.print("The Fibonacci series till "+limit+ " is:" +i+j);
		while(Temp<limit)
		{
			Temp = i+j;
			i=j;
			j=Temp;
			if(Temp<limit)
			System.out.print(Temp);
		}
	}

}
