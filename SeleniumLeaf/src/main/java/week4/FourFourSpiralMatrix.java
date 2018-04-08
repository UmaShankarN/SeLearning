package week4;

import java.util.Scanner;

public class FourFourSpiralMatrix {

	public static void main(String[] args) 
	{
	 Scanner input =new Scanner(System.in);
	// int[] in = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	// int n=0;
	 
	 int[] in = new int[16];
	 for(int i=0; i<16;i++)
	 {
		 in[i]=input.nextInt(); 
	 }
	 for(int i=0; i<16;i++)
	 {
		 System.out.print(in[i]+"\t"); 
		 if(i==3||i==7||i==11||i==15)
		 {
			 System.out.println("\n");
		 }
	 }
	 
	 for(int i=0;i<4;i++)
	 {
		 System.out.print(in[i]+"\t");
		 for(i=3;i<=15;)
		 {
			 i=i+4;
			 //System.out.print("\t");
			 System.out.println(in[i]);
			 if(i==15)
			 {
		 		 for(i=15;i<=12;)
		 		 {
		 		  i=i-1;
		 		  System.out.println(in[i]);
		 		 }
		 
			 }
		 }

	 }
	}
}
