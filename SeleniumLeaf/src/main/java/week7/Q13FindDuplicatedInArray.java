package week7;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Q13FindDuplicatedInArray {

	public static void main(String[] args) {
		/*Write a simple Java Program to find the duplicate numbers in an int array 
		and store in to a separate array*/
		int a[] = {1,2,4,2,3,4,5,6,7,5};
		List<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i =0; i<a.length; i++)
			{
				arrayList.add(a[i]);
			}
		System.out.println("The numbers in input array are: "+arrayList);
		
		Set<Integer> arraySort = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length;i++)
			{
			 arraySort.add(a[i]);
			}
		//System.out.println(arraySort);

		for ( Integer eachNumber : arraySort)
			{
			arrayList.remove(eachNumber);
			}
		System.out.println("Duplicated Numbers are: "+arrayList);
	}

}
