package week7;

import java.util.Scanner;

public class GetUserInputUntilSatifiesCondition {

	public static void main(String[] args) {
			// Get User Input Until it Satifies Condition
		Scanner in = new Scanner(System.in);

		int a;
		a = in.nextInt();
		while(a%2==0){
			System.out.println("The given input is even cannot print the pattern, please try with odd number");
			a = in.nextInt();
		}
		
		in.close();
	}

}
