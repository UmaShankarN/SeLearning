package week5;
import java.util.Scanner;


public class SwapStringWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a simple java program to swap two strings without using a third variable*/
		
		Scanner in = new Scanner(System.in);
		String string1=in.nextLine();
		String string2=in.nextLine();
		System.out.println("String before swapping: "+string1+ " and "+string2);
		int length = string1.length();
		string1=string1+string2;
		//System.out.println(string1);
		string2=string1.substring(0,length);
		//System.out.println(string2);
		string1=string1.substring(length, string1.length());
		//System.out.println(string1);
		System.out.println("String after swapping: "+string1+ " and "+string2);
	}

}
