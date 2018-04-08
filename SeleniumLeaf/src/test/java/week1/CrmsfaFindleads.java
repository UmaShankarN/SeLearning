package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CrmsfaFindleads {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//setProperty for the browser
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
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("uma");
		//driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();//using attribute based collection
		//driver.findElementByXPath("//button[text()='Find Leads']").click();//using text based
		//button[contains(text(),'Find ')]
		//input[contains(@name,'Name')]
		driver.close();
		
		
	}

}
