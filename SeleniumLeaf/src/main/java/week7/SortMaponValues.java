package week7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.google.common.base.Objects;

public class SortMaponValues {

	public static void main(String[] args) {
		// write a Java program to sort a Map based on the values
			Map<String, Integer> beforeSort = new LinkedHashMap<>();
			beforeSort.put("One", 1);
			beforeSort.put("Seventeen", 17);
			beforeSort.put("Twelve", 12);
			beforeSort.put("Five", 5);
			beforeSort.put("Two", 2);
			beforeSort.put("Twenty Five", 25);
			System.out.println(beforeSort);
//			Map<Integer, String> sort = new TreeMap<>();
//			for(Entry<String, Integer> entry: beforeSort.entrySet())
//			{
//				sort.put(entry.getValue(), entry.getKey());
//			}
//			System.out.println(sort);
//			Map<String, Integer> afterSort = new LinkedHashMap<>();
//			for (Entry<Integer, String> entry : sort.entrySet()) {
//				afterSort.put(entry.getValue(), entry.getKey()) ;
//			}
//			System.out.println(afterSort);
			int[] getValues = new int[beforeSort.size()];
			int i=0;
				for (Entry<String, Integer> entry : beforeSort.entrySet()) {
					getValues[i]=entry.getValue();
					//System.out.print(getValues[i]);
					i++;
				}
				//System.out.println(getValues[2]);
			int temp=0;
			for(int j =0; j<getValues.length;j++)
			{
				for(int k=j+1;k<getValues.length;k++)
				{
					if(getValues[j] > getValues[k])
					{
					temp = getValues[j];
					getValues[j] = getValues[k];
					getValues[k] = temp;
					}
				}
			}
		for(int j=0; j<getValues.length;j++)
		{
			for (Entry<String, Integer> entry : beforeSort.entrySet())
			{
				if(entry.getValue().equals(getValues[j]))
				{
					System.out.println(entry.getKey()+"=" +entry.getValue());
				}
			}
		}
	}

}
