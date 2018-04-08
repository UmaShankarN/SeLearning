package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LearnduplicatesHashMap {

	public static void main(String[] args) 
	
	{
	
		String txt ="Hexaware India";
		
		char[] txtToChar = txt.toCharArray();
		
		Map<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
		Map<Character,Integer> charMap2 = new LinkedHashMap<Character,Integer>();
		for(char eachChar:txtToChar){
			
			if(charMap.containsKey(eachChar)){
				charMap.put(eachChar, charMap.get(eachChar)+1);
			}
			else
			{
				charMap.put(eachChar,1);
			}
			
		}
		System.out.println(charMap);
	System.out.println(charMap.get('e'));
	System.out.println(charMap.entrySet());
	for (Entry<Character, Integer> eachEntry1: charMap.entrySet()) 
	{
		for (Entry<Character, Integer> eachEntry2: charMap.entrySet())
		{
			if(eachEntry1.getValue()<eachEntry2.getValue())
			{
				
			charMap2.put(eachEntry2.getKey(), eachEntry2.getValue());
				
			}
		}
		
	}
	System.out.println(charMap2);
	Object[] a =charMap2.keySet().toArray();
	
	System.out.println(a[0]);
	//System.out.println(charMap2.get(a[0]));
	//System.out.println(a.length);
//	int temp=0;
//	
//	int[] tempArray = new int[a.length];
//	
//	for(int i =0; i<a.length;i++)
//	{
//		tempArray[i] = charMap2.get(a[i]);
//		System.out.println("tempArray: " +tempArray[i]);
//	}
	
//	for(int i =0;i<a.length;i++)
//	{
//		for(int j =i+1;j<a.length;j++)
//	{
//		if(tempArray[i] > tempArray[j])
//		{
//			temp = tempArray[i];
//			tempArray[i] = tempArray[j];
//			tempArray[j] = temp;
//		}
//	}
//	}
//	//if(charMap2.get(a[i]))
	//System.out.println(tempArray[0]);
	//int f = tempArray[0];
	System.out.println();
	//System.out.println(a[tempArray[0]]);
	
	}

}
