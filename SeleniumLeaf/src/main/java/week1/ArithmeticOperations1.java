package week1;

import java.util.Scanner;

public class ArithmeticOperations1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two Number to perform Arithmetic Operation: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("Enter the Valid Arithmetic Operation; For Additon give ADD, For Subtraction give SUB, For Multiplication give MULT, For Division give DIV: ");
		String operations = input.next();
			switch(operations)
			{
			  case "ADD":
				  System.out.println("The Addition of Two number is: "+ (n1+n2));
				  break;
			  case "SUB":
				  System.out.println("The Addition of Two number is: "+ (n1-n2));
				  break;
			  case "MULT":
				  System.out.println("The Addition of Two number is: "+ (n1*n2));
				  break;
			  case "DIV":
				  System.out.println("The Addition of Two number is: "+ (n1/n2));
				  break;
			  default:
				  System.out.println("Incorrect Operation Entered/Check the string input is Case-sensitive");
			}
		
		
	}

}
