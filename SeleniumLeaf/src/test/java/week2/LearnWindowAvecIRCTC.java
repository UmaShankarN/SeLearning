package week2;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowAvecIRCTC 
{
	private static final int FILE = 0;

	public static void main(String[] args) throws IOException 
	{
		//SetProperty for the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("Contact Us").click();
		/*Storing First Window handle to the string firstWindow*/
		String firstWindow=driver.getWindowHandle();
		/*Getting handles of all opened Window*/
		Set<String> openWindows1=driver.getWindowHandles();
	//	String newWindow = null;
		for(String currentWindow:openWindows1)
		{
			System.out.println(currentWindow);
			driver.switchTo().window(currentWindow);
		}
		//System.out.println(firstWindow);
		System.out.println(driver.getTitle());
//		Set<String> openWindows2=driver.getWindowHandles();
//		for(String currentWindow2:openWindows2)
//		{
//			System.out.println(currentWindow2);
//			driver.switchTo().window(currentWindow2);
//		}
		driver.switchTo().window(firstWindow);
		/*File src= driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("./drivers/img.jpeg");
		FileUtils.copyFile(src, desc);*/
		driver.quit();
		
		
//		Set<String> openWindows2=driver.getWindowHandles();
//		for(String currentWindow2:openWindows2)
//		{
//			System.out.println(currentWindow2);
//			System.out.println(firstWindow);
//			if(currentWindow2.equals(firstWindow))
//			{
//			driver.switchTo().window(firstWindow);
//			driver.close();
//			}
		}

			
		}


