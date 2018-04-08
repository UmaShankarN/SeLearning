package week3;

public class MultiplesOf3Or5LessThan100 
{
	public static void main(String[] args) 
	{
		//Declare the variable

		int getthreemul=0, getfivemul=0, total, n=0;

		//Use for loop to perform the 99 iterations
		
		for(int i=1;i<100;i++)
		{
		 if(i%3 == 0)
		 	{
			 getthreemul=i;
			}
		 else if(i%5 == 0)
			{
			 getfivemul=i;
			}
		total=n+getthreemul+getfivemul; //perform addition if the if condition satisfies
		n=total;
		getthreemul=0;
		getfivemul=0;
		}
		 System.out.println("The sum of all multiples of 3 or 5 less than 100 is: "+n); //print the output
	}
}
