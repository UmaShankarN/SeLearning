package week7;

import java.util.ArrayList;
import java.util.List;

public class Q14AlternativeFromList {

	public static void main(String[] args) {
		// Write a Java program to copy only alternative numbers in list to another list
		//Given data: {1,2,3,4,7,8}
		int[] givenNumbers = {1,2,3,4,7,8};
		
		List<Integer> arrayList1 =new ArrayList<>();
		for(int i=0;i<givenNumbers.length;i++)
		{
			arrayList1.add(givenNumbers[i]);
		}
		System.out.println(arrayList1);
		int j=1;
		List<Integer> arrayList2 =new ArrayList<>();
		for (int eachInteger : arrayList1) 
		{
			if(j%2!=0)
			{
			arrayList2.add(eachInteger);
			}
			j++;
		}
		System.out.println(arrayList2);
	}

}
