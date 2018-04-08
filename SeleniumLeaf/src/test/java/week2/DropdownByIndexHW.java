package week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownByIndexHW {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		//Open the URL
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		WebElement dropDown= driver.findElementById("dropdown1");
		Select fromDropDown = new Select(dropDown);
		int sizeofDropDown= fromDropDown.getOptions().size();
		//System.out.println(sizeofDropDown);
		fromDropDown.selectByIndex(sizeofDropDown-2);

	}

}