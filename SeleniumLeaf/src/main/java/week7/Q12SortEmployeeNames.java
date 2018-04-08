package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q12SortEmployeeNames {

	public static void main(String[] args) {
		// Write a Java Program to sort the given employee names
		//Given data: John, Pradeep, Mary, Ramya
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the count of Employee:");
		int count = in.nextInt();
		
		String[] names = new String[count];	
		for(int i=0;i<count;i++)
		{
			names[i]=in.next();
		}
		//System.out.println(names[count-1]);
		Set<String> sortNames = new TreeSet<>();
		for(int i=0; i<count;i++)
		{
			sortNames.add(names[i]);
		}
		System.out.println("Sorted after adding in Set"+sortNames);
		List<String> sortFromList = new ArrayList<>();
		for(int i=0; i<count;i++)
		{
			sortFromList.add(names[i]);
		}
		System.out.println(sortFromList);
		Collections.sort(sortFromList);
		System.out.println("Sorted after adding in list"+sortFromList);
		in.close();
	}

}
