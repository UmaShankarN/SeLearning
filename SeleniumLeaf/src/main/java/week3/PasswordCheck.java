package week3;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) 
	{
	 Scanner in = new Scanner(System.in);
	 System.out.println("Enter the Password: ");
	 String password=in.nextLine();
	 System.out.println(password);
	 String[] passwordArray=password.split("");
	 String[] alphanumeric={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
	 String[] capital={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","V","X","Y","Z"};
	 //To verify the password has atleast 10 characters
	 int passwordLength = password.length();
	 int n=0,t=0;
	 if (passwordLength<10)
	 {
		 System.out.println("Your password should have atleast 10 characters");
		  	 	
	 }
	  if(passwordLength>=10)
	 	 {
		 for(int i=0; i<passwordLength; i++)
	     {
			 if(!((Arrays.toString(alphanumeric).contains(passwordArray[i]))||(Arrays.toString(capital).contains(passwordArray[i]))))
			 {
				n++;
			 }
		 } 
	// System.out.println(n);
	 if (n>1)
	 {
		 System.out.println("Your password has special character/ characters. Please don't use special characters");
		 
	 }
	 else if((n>4) && (n<=passwordLength-2))
	 {
		 System.out.println("Your password has special character/ characters. Please don't use special characters"+ "\n" +" and Your password should contain atleast two letters and two digits");
	 }
	 for(int i=0,k=0; i<passwordLength; i++)
		 {
			 if(Arrays.toString(capital).contains(passwordArray[i]))
			   {
				 k++;
				 if(k==1)
				 {
					//System.out.println(k);
					 break;
				 }
				 					  //System.out.print(passwordArray[i]);
			    }
			     else 
			      {
			    	 
				   if(i==passwordLength-1)
				    {
					 System.out.println("Your password should have atleast one Upper Case letter");
				    }
				     }
		   }
	 }
	 for(int i=0; i<passwordLength; i++)
	 {
	 if(((Arrays.toString(alphanumeric).contains(passwordArray[i]))||(Arrays.toString(capital).contains(passwordArray[i]))))
	 {
		 t++;
	 }
	 }
	 if(t==passwordLength)
	 {
		 System.out.println("The given password is valid");
	 }
	 	  }
	 }
	 
	 
		
		


