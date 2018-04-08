package week2;

public class LearnArmstrongNumber1 
{

	public static void main(String[] args) 
	{
		int store;
		int n, temp;
        System.out.println("The Armstrong Numbers between 100 and 1000 are:");
		for (int input=100; input<=1000; input++)
		 {	
		    temp=input;// Assigning the input value from input variable to temp variable, so that the input variable is not disturbed
		    store=0; 
		    while(temp>0)                //Use while loop to perform cubic sum of each digits and store it in store variable.
			{
			 n= temp%10;
			 store= store+(n*n*n);
			 temp=temp/10;
			}
		    		    
	 //System.out.println(store);

		 if (store==input)		//use if condition to verify if the store input matches with the input variable
			{
		 	 System.out.print(store+ "\t");	//print store if the matches else increment the input variable to perform the same operation again until it reaches 1000
			}

	}

	}
}
