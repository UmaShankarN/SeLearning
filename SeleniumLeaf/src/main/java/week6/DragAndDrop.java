package week6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		//Open the URL
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement ele = driver.findElementByXPath("//Span[.='Appliances']");
		Actions builder = new Actions(driver);
		
		//builder.moveToElement(ele).build().perform();
		//builder.moveToElement(target, xOffset, yOffset)
		//builder.moveToElement(ele, 338, 98).build().perform();

		builder.moveByOffset(338, 98).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//Span[.='Sony']").click();
		//driver.close();

	}

}
