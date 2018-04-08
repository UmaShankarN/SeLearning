package week1;

import java.util.Scanner;

public class Palindrome1
{

	public static void main(String[] args)
	{
     Scanner input= new Scanner(System.in);
     System.out.println("Enter the input number/string: ");
     String  in = input.next();
     //String in1="";
    // char[] in1=in.toCharArray();
     String rev="";//declaring empty string
     //System.out.print(rev);
   for(int i=(in.length())-1;i>=0; i--)
    {
	   rev=rev+in.charAt(i); //inserting characters from last to first in the string rev
	   //System.out.println(in.charAt(i));
    }
     System.out.println(rev);
	if(rev.equals(in))//validating if  rev and in matches
			System.out.println("Palindrome");
	else
		System.out.println("Not a Palindrome");

    		 
	}

}
	