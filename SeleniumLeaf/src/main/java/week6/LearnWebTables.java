package week6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTables {

	public static void main(String[] args)
	{

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		//Open the URL
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Give User name and Password
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("SC",Keys.TAB);
		
		driver.findElementById("buttonFromTo").click();
		
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
		
		//no of rows
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		int rowsSize = rows.size();
		
		//no of columns
		
		int columnnsSize=rows.get(0).findElements(By.tagName("td")).size();
	
		
		System.out.println(rows.get(0).findElements(By.tagName("td")).get(5).getText());
	}

}
