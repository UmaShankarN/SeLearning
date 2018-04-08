package week1;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome2
{

	public static void main(String[] args)
	{
     Scanner input= new Scanner(System.in);
     StringBuffer input1= new StringBuffer();
     System.out.println("Enter the input number/string: ");
     String  in = input.nextLine();
     int j=0;
    // String t;
    // System.out.println(in.charAt(0));
    // System.out.println(in.length());
     //char[] in1=in.toCharArray();
     String rev[]=new String[10];
     for(int i=(in.length())-1;i>=0; i--)
      {
	   rev[j]=String.valueOf(in.charAt(i));
	   //System.out.print(rev[j]);
	   input1.append(rev[j]);
	   j++;
	  }
     String toCompare = input1.toString();
     //StringBuffer rev1=input1.append(rev);
   //  System.out.println(input1);
    // System.out.println(toCompare);
     if(toCompare.equals(in))
		System.out.println("Palindrome");
     else
    	 System.out.println("Not a Palindrome");
	 	}

}