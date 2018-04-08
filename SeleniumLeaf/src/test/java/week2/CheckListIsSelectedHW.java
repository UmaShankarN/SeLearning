package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class CheckListIsSelectedHW {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		//Open the URL
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		boolean  check = driver.findElementByXPath("(//input[@type ='checkbox'])[6]").isSelected();
		if(check==true)
		{
			System.out.println("The Check list is enabled");
		}
		else
		{
			System.out.println("The Check list is not enabled");
		}
	}

}
