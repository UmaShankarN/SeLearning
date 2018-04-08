package week2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractWithDropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		//Open the URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Give User name and Password
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		//Click CRMSFA link
		driver.findElementByLinkText("CRM/SFA").click();
		//Create Lead
		driver.findElementByLinkText("Create Lead").click();
		//Give First Name, Last Name, Company Name and create
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Uma");
		driver.findElementById("createLeadForm_lastName").sendKeys("N");
		
		WebElement link= driver.findElementById("createLeadForm_dataSourceId");
		Select fromDropdown = new Select(link);
		fromDropdown.selectByVisibleText("Conference");
		driver.close();

	}

}
