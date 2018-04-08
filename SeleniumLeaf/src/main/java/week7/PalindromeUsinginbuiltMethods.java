package week7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PalindromeUsinginbuiltMethods {

	public static void main(String[] args) 
	{
		//Write a Java program to check of the given number is palidrome or not
		int a = 1221;
		String inputNumber = Integer.toString(a);
		//String inputName = "Mam".toLowerCase();
		StringBuilder sb = new StringBuilder(inputNumber);
		//System.out.println(sb.reverse());
//Set<String> wd = new HashSet<>();
//
//List<String> l = new ArrayList<>();
		if(inputNumber.contentEquals(sb.reverse()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");
		}
		
		StringBuffer sbf = new StringBuffer(inputNumber);
		if(inputNumber.contentEquals(sbf.reverse()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");
		}
		//Try 2:
		String temp ="";
		int n, l =a;
		while(a>0)
		{
		n=a%10;
		temp = temp+n;
		a=a/10;
		}
		System.out.println(Integer.parseInt(temp));
	 if(l == Integer.valueOf(temp))
		{
		 System.out.println("Palindrome");
		}
	 	else
	 	{
		 System.out.println("Not a Palindrome");
	 	}
	}

}
