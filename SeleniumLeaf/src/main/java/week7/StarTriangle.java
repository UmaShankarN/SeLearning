package week7;
import java.util.Scanner;
public class StarTriangle {

	public static void main(String[] args) {
		//Write a Java Program to print the star traingle for the given numbere of rows(Right Angle Triangle)
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = in.nextInt();
		int loop = rows;
		int star=1;
		System.out.println("Right Angled Triangle: ");
		for(int i =0; i<rows;i++)
		{
			for(int j =0; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Write a Java Program to print the star traingle for the given numbere of rows(Equivalent Angle Triangle)
		System.out.println("Equivalent Triangle: ");
		for(int k=0;k<loop;k++)
		{
			for(int i=0; i<rows;i++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			rows=rows-1;
			star = star +2;
		}
		//Write a Java Program to print the star traingle for the given numbere of rows(Right Angled right Triangle)
		System.out.println("Right Angled right Triangle: ");
		int rows1= loop;
		int star1=1;
		for(int k =0;k<loop;k++)
		{
			for(int i=0; i<rows1-1; i++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star1 = star1+1;
			rows1 =rows1-1;
		}
		//Write a Java Program to print the star traingle for the given numbere of rows(Right Angle Triangle)
		System.out.println("Right Angled Triangle: ");
		int star3=1;
		for(int i=0;i<loop;i++)
		{
			for(int j=0;j<star3;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star3 = star3+1;
		}
	}

}
