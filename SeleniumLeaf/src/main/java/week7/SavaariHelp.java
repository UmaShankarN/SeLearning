package week7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SavaariHelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> carMap2 = new TreeMap<>();
		
		carMap2.put("Tata Indica or Equivalent", 7565 );
		carMap2.put("Toyota Etios or Equivalent", 7592);
		carMap2.put("Ertiga or Equivalent", 8683);
		carMap2.put("Toyota Innova", 9411);
		carMap2.put("Honda City or Equivalent", 24692);
		carMap2.put("Toyota Corolla or Equivalent", 26147);
		carMap2.put("Toyota Camry or Equivalent", 59619);
		carMap2.put("Mercedes E class", 77083);
		
		System.out.println(carMap2);
		
		///Map<Integer,String> carMapInsert = new TreeMap<>();
		String carNames[] = new String[carMap2.size()];
		
		//get the car names(key) in a string array
		int i=0;
			for (Entry<String, Integer> eachCarEntry : carMap2.entrySet()) 
			{
				
				carNames[i] = eachCarEntry.getKey();
				System.out.println(carNames[i]);
				i++;
			}
			System.out.println(carMap2.keySet().toArray()[0]);
		//get the keys from input carMap2 map and pass it to an Object array
			Object a[] =carMap2.keySet().toArray();
			//System.out.println(a[1].toString());
		//removing the carnames from carMap2 that does not match Toyota
			for(int j=0;j<carMap2.size();j++)
			{
				if(!a[j].toString().contains("Toyota"))
				{
					carMap2.remove(carNames[j]);
				}
			}
			
			System.out.println(carMap2);
			
//Adding the carnames from carMap2  to carMapInsert that  match Toyota
//		for (Entry<Integer, String> carEntry : carMap2.entrySet()) 
//		{
//			if(carEntry.getValue().contains("Toyota"))
//			{
//				System.out.println(carEntry.getKey() + "=" +carEntry.getValue());
//				carMapInsert.put(carEntry.getKey(), carEntry.getValue());
//			}
//		}
//		System.out.println(carMapInsert);
		
/*removing the carnames from carMap2 that does not match Toyota	*/	
//		Iterator<Entry<Integer, String>> carEntryIterator = carMap2.entrySet().iterator();
//		while(carEntryIterator.hasNext())
//		{
//			Entry<Integer, String> carEntry = carEntryIterator.next();
//			if(!carEntry.getValue().contains("Toyota"))
//			{
//					//System.out.println(carEntry.getKey() + "=" +carEntry.getValue());
//				carEntryIterator.remove();
//				}
			
//		}
	
	
//System.out.println(carMap2);
//System.out.println(Collections.max(carMap2.keySet()));
//int maxOfCarMapInsert=Collections.max(carMap2.keySet());
//for (Entry<Integer, String> eachCarEntry : carMap2.entrySet()) 
//{
//	if(maxOfCarMapInsert == eachCarEntry.getKey())
//	{
//		System.out.println(eachCarEntry.getValue());
//	}
//	
//	
//}
	}
	
}
