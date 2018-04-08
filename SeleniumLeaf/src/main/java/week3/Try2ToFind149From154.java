package week3;

import java.util.Scanner;

public class Try2ToFind149From154 {

	public static void main(String[] args) 
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = in.nextInt();
		System.out.println("Enter the digit: ");
		int digit=in.nextInt();
		String fromInput[] = null;
		int n=input;
		int i, l=0;
		while(n>0)
		{
			i=n%10;
			fromInput[l]=Integer.toString(i);
			
			n=n/10;
			l++;
					
		}
			System.out.println(l);
			System.out.println();

	}

}
