package week4;

import java.util.Scanner;

public class AscendingOrder1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = in.nextInt();
		String inputToString = new Integer(input).toString();
		int inputLength = inputToString.length();
		int digit;
		Integer[] ascint = new Integer[inputLength];
		int i=0;
		while(input !=0)
		{
			digit =input%10;
			ascint[i]= digit;
			input =input/10;
			i++;
		}
		//System.out.println(ascint);
		int temp=0;
		 for (int j = 0; j < inputLength; j++)
	            for (int k = j + 1; k < inputLength; k++)
	            {
	                if (ascint[j] > ascint[k])
	                {
	                    temp = ascint[j];
	                    ascint[j] = ascint[k];
	                    ascint[k] = temp;
	                }
	            }
		 System.out.println("Ascending order: ");
		// System.out.println(ascint[0]);
		 for(int s:ascint)
		 {
			 System.out.print(s);
		 }
		 
		 //String unique = ascint.toString();
//		 Scanner in2 = new Scanner (System.in); 
//		   System.out.println("Enter the String: ");
//		     String unique =in2.nextLine().replace(" ", "").toLowerCase();
//		     String result = "";
//		   
//		     //input = in.nextLine();
//
//		      for (int l = 0; l < unique.length(); i++)
//		         {
//		            if (result.indexOf(unique.charAt(l)) == - 1){
//		            	result = result + unique.charAt(l);
//		         }
//		      }
//		     
//
//		    System.out.println(result);
	}

}
