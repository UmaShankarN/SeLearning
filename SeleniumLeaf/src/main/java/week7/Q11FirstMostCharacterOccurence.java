package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q11FirstMostCharacterOccurence {

	public static void main(String[] args) {
		// Write a Java program to print the first most number of character occcurences
		String given = "I am getting better every day";
		char[] givenToCharArray = given.replace(" ", "").toCharArray();
		//System.out.println(givenToCharArray[1]);
		Map<Character, Integer> charIntMap = new LinkedHashMap<>();
		for (char eachCharacter : givenToCharArray) 
		{
			if(charIntMap.containsKey(eachCharacter))
				{
				  charIntMap.put(eachCharacter,charIntMap.get(eachCharacter)+1);
				}
				else
				{
				charIntMap.put(eachCharacter,1);
				}
			
		}
		//Getting maximum number using List
		List<Integer> list = new ArrayList<>();
		list.addAll(charIntMap.values());
		System.out.println(list);
		Collections.sort(list);
		//Collections.reverse(list);
		int maxNumberFromList = list.get(list.size()-1);
		System.out.println(maxNumberFromList);
		
		System.out.println(charIntMap);
		//Getting maximum number using collections 
		System.out.println(Collections.max(charIntMap.values()));
		int maxNumber= Collections.max(charIntMap.values());
		for (Entry<Character, Integer> eachEntry : charIntMap.entrySet()) 
		{
			if(eachEntry.getValue() == maxNumber)
			{
				System.out.println(eachEntry.getKey());
			}
		}
	}

}
