package week3;

import java.util.Scanner;

public class FactorsAndPrimeFactors
{
	public static void main(String[] args) 
	{
	 Scanner in = new Scanner(System.in);
	 System.out.println("Please enter the number: ");
	 int input=in.nextInt(); //get the input from user for which factors to be found
	 for(int i=1;i<=input;i++) // for loop to iterate till the given 'number'
	 {
	   if(input%i == 0) //if condition to check if the given number provides denominator '0' on diving it by '1' to given 'number'
		{
		 System.out.println("The factors of given number " +input+" are: " +i); //it will store the result in the factors integer array
		}
	 }
	// System.out.println(factors);
	 FactorsAndPrimeFactors f = new FactorsAndPrimeFactors(); //creating an object 'f' for the class Factors
	f.primeFactors(input);
	}
//
  public void primeFactors(int number) // from the result taking the prime factors alone
    {
	 
	 int counter=0;
	 for(int i=1;i<=number;i++)
		 {
		  if(number%i == 0)
		  {
			  for(int j=i; j>=1;j--)
			  {
			    if(i%j == 0)  
			    {
			    	counter++;
			    }
			  }
			      if(counter == 2)
			      {
			    	  System.out.println("The prime factors are: " +i);
			      }
			  }
		  counter=0;  
		  }
	 }
}


