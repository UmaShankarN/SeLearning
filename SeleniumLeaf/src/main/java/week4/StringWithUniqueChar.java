package week4;

import java.util.Scanner;
public class StringWithUniqueChar{
   public static void main (String[]args){
   Scanner in = new Scanner (System.in); 
   System.out.println("Enter the String: ");
     String input =in.nextLine().replace(" ", "").toLowerCase();
     String result = "";
   
     //input = in.nextLine();

      for (int i = 0; i < input.length(); i++)
         {
            if (result.indexOf(input.charAt(i)) == - 1){
            	result = result + input.charAt(i);
         }
      }
     

    System.out.println(result);
    in.close();
   }
}  