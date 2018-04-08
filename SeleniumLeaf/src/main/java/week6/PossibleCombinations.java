package week6;

import java.util.Scanner;

public class PossibleCombinations {
	 public static void main(String[] args) {
	        Scanner in =  new Scanner(System.in);
	        int input[] = new int[3];
	        System.out.println("Enter the three numbers: ");
	        for(int i=0;i<3;i++)
	        {
	        	input[i] = in.nextInt();
	        }
	        
	        for (int a = 0; a < 3; a++) 
	        {
	            for (int b = 0; b < 3; b++) 
	            {
	                for (int c = 0; c < 3; c++) 
	                {
	                    if (a != b && b != c && c != a) 
	                    {
	                        System.out.print(input[a]);
	                        System.out.print(input[b]);
	                        System.out.print(input[c]);
	                        System.out.println();
	                    }
	                }
	            }
	        }
	 in.close();
	    }

}
