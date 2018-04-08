package week5;

import java.util.Scanner;


public class ToUpperCase {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String/Character: ");
        String lowerCase = in.nextLine();
        String toUpperCase="";
        int a, b;
        int length = lowerCase.length();
        for(int i=0; i<length; i++)
            {
              a=lowerCase.charAt(i);
              b=a-32;
              
                if(b<64||b==0){//If the given character is a(97) then it should convert to A(65). For any character less than 65 and space it should leave the validation 
                    toUpperCase=toUpperCase+lowerCase.charAt(i);
                }
                else {
                    toUpperCase= toUpperCase+((char)b);
                }
             
            }
        System.out.println("The given String/Character is: " +lowerCase+ " and the String/Character after conversion is: "+toUpperCase);
        in.close();
    }

}
