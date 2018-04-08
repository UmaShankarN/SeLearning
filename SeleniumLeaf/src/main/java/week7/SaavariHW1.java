package week7;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaavariHW1 {

	public static void main(String[] args) {
		/* Homework for this week Q#1 
		1. Launch a browser and load www.savaari.com
		2. Enter From city as Chennai.
		3. Enter To city as Bangalore.
		4. Click select car.
		5. Find the costliest Toyota car in the result and print its Rate and Name.
		Tips : You need to use Find elements, Construct xpath using following, 
		Regular expression, String to number, Collections (map and/or list).*/
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Step 1: Enter the URL, form, to location and click Search
		driver.get("http://www.savaari.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("from_city").sendKeys("Chennai, TN");
		driver.findElementByName("to_city_1[]").sendKeys("Bangalore, Karnataka");
		driver.findElementById("go").sendKeys(Keys.ENTER);
		List<WebElement>  carDetails  = driver.findElementsByTagName("strong");
		//System.out.println(carDetails.size());

		
		Map<String,Integer> carMap = new TreeMap<>();
		for(int i =0; i<carDetails.size();i+=2)
		{
			carMap.put(carDetails.get(i).getText(), Integer.parseInt(carDetails.get(i+1).
					getText().replaceAll("[Rs.,]", "").trim()));
		}
		System.out.println(carMap);
		//System.out.println(carMap.get("Ertiga or Equivalent"));
		Map<String, Integer> carMapInsert = new TreeMap<>();
		for (Entry<String, Integer> eachCarEntry : carMap.entrySet()) 
		{
			if(eachCarEntry.getKey().contains("Toyota"))
			{
				//System.out.println(eachCarEntry.getKey() + "=" +eachCarEntry.getValue());
				carMapInsert.put(eachCarEntry.getKey(), eachCarEntry.getValue());
			}
		}
		//System.out.println(carMapInsert);
		/*{Toyota Camry or Equivalent=59790, Toyota Corolla or Equivalent=26222, Toyota Etios or Equivalent=7613, 
		 * Toyota Innova=9437}*/
		int maxOfCarMapInsert =	Collections.max(carMapInsert.values());
		//System.out.println(maxOfCarMapInsert);
		//System.out.println(Collections.min(carMapInsert.values()));
		for (Entry<String, Integer> eachCarEntry : carMapInsert.entrySet()) 
		{
			if(maxOfCarMapInsert == eachCarEntry.getValue())
			{
				System.out.println("Costliest Toyota car is: "+eachCarEntry.getKey()+ "= Rs." +eachCarEntry.getValue());
			}
			
			
		}
	}
		
}
