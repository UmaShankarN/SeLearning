package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesPrintTrainNumbers {

	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		//driver.findElementById("buttonFromTo").click();
		if(driver.findElementById("chkSelectDateOnly").isSelected())
		{
			driver.findElementById("chkSelectDateOnly").click();
		}
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		 List<WebElement> tableRows =	 table.findElements(By.tagName("tr"));
		 System.out.println("tableRows"+tableRows);
		int rowsSize = table.findElements(By.tagName("tr")).size();
		System.out.println("rowsSize"+rowsSize);
		 List<String> trainNameBeforeclick = new ArrayList<>();
		for(int i=0;i<rowsSize;i++)
		{
			//System.out.println( tableRows.get(i).findElements(By.tagName("td")).get(1).getText());
			trainNameBeforeclick.add(tableRows.get(i).findElements(By.tagName("td")).get(1).getText());
			
		}
		System.out.println(trainNameBeforeclick);
		//System.out.println(rwoSize);
		Collections.sort(trainNameBeforeclick);
		System.out.println(trainNameBeforeclick);
		
		
		driver.findElementByLinkText("Train Name").click();
		Thread.sleep(3000);
		WebElement table1 = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		 List<WebElement> tableRows1 =	 table1.findElements(By.tagName("tr"));
		 System.out.println("tableRows1"+tableRows1);
			int rowsSize1 = table1.findElements(By.tagName("tr")).size();
			System.out.println("rowsSize1"+rowsSize1);
		List<String> trainNameafterclick = new ArrayList<>();
		for(int i=0;i<rowsSize1;i++)
		{
			//System.out.println( tableRows.get(i).findElements(By.tagName("td")).get(1).getText());
			trainNameafterclick.add(tableRows1.get(i).findElements(By.tagName("td")).get(1).getText());
			
		}
		System.out.println(trainNameafterclick);
		
		//if(trainNameBeforeclick.containsAll(trainNameafterclick))
		if(Arrays.equals(trainNameBeforeclick.toArray(),trainNameafterclick.toArray()))
			System.out.println("List Matches");
			else
				System.out.println("Not Maches");
//		if(trainNameBeforeclick == trainNameafterclick)
//			System.out.println("Matches");
//		else
//			System.out.println("Not matches");
		
	}

}
