package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CrmsfaLogin {

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
		driver.findElementByLinkText("Create Lead").click();
		//Give First Name, Last Name, Company Name and create
		driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Uma");
		driver.findElementById("createLeadForm_lastName").sendKeys("N");
		driver.findElementByClassName("smallSubmit").click();
		driver.close();
	}

}
