package week6;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnGrid {
@Test
	public  void learnGrid() throws MalformedURLException {
//		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe" );
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("firefox");
		//dc.setVersion("53");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver	driver = new RemoteWebDriver(new URL("http://192.168.225.223:4444/wd/hub"), dc);
//		
//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe" );
//		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele = driver.findElementByXPath("//Span[.='Appliances']");
	
		Actions builder = new Actions(driver);
		
		builder.moveToElement(ele).pause(Duration.ofSeconds(5)).build().perform();
		
		driver.findElementByXPath("//Span[.='Sony']").click();
		//driver.close();
		
	}

}
