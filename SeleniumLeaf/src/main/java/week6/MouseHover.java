package week6;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		//Open the URL
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement demoFrame = driver.findElementByClassName("demo-frame");
	
		driver.switchTo().frame(demoFrame);
		
		WebElement from = driver.findElementByXPath("//li[.='Item 1']");
		
		Point to =driver.findElementByXPath("//li[.='Item 5']").getLocation();
		
		System.out.println(to);
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(from, to.getX(), to.getY()).perform();
		
		//System.out.println(builder.hashCode());
		

	}

}
