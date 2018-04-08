package week2;

import java.util.Scanner;

public class LearnFloydNumber {

	 public static void main(String args[])
	   {
	      int n, num = 1, i, j;
	      Scanner input = new Scanner(System.in);
	 
	      System.out.println("Enter the number of rows:");
	      n = input.nextInt();
	 
	      System.out.println("Floyd's triangle:");
	 
	      for ( i = 1 ; i <= n ; i++ )
	      {
	         for ( j = 1 ; j <= i ; j++ )
	         {
	            System.out.print(num+" ");
	            num++;
	         }
	         System.out.println();
	      }
	   }
	}
