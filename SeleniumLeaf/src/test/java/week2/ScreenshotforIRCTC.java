package week2;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotforIRCTC 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "F:/New/Softwares/drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		File src= driver.getScreenshotAs(OutputType.FILE);
		File desc=new File("F:/New/Softwares/eclipse/1.jpg");
		FileUtils.copyFile(src, desc);
		}
}


