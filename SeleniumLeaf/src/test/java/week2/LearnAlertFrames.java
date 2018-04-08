package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertFrames 
{
 public static void main(String[] args)
 {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Switch to Frame
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("/html/body/button").click();
		
		
		//Switch to Alert
		String input = "Something";
		Alert alt =	driver.switchTo().alert();
		alt.sendKeys(input);
		
		//Accept the Alert
		
		alt.accept();
		
		//Get  Text
		
		String output= driver.findElementById("demo").getText();
		
		
		if(output.contains(input))
		{
			System.out.println("Alert Handled");
		}
		
		else{
			System.out.println("Alert Not Handled");
		}
		
		driver.switchTo().defaultContent();
		
		driver.findElementById("tryhome").click();
}
}
