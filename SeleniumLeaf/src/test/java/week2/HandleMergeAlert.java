package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMergeAlert {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/crmsfa/control/findLeads");
		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("loginButton").click();
		driver.findElementByXPath("//span[contains(.,'Email')]").click();
		//clickByXpath("//span[contains(.,'Email')]");
		driver.findElementByName("emailAddress").sendKeys("test@gmail.com");
		//enterByName("emailAddress", "test@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']");
		//clickByXpath("//button[text()='Find Leads']");
		
		String capturedName= driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println(capturedName);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String b = driver.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println(b);
		//verifyTextById("sectionHeaderTitle_leads", "Duplicate Lead");
		//clickByName("submitButton");
		
		//verifyTextById("viewLead_firstName_sp",capturedName);
		
//		driver.get("http://leaftaps.com/crmsfa/control/mergeLeadsForm");
//		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
//		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
//		driver.findElementByClassName("loginButton").click();
//		driver.findElementByLinkText("Merge").click();
//		String a =driver.switchTo().alert().getText();
//		System.out.println(a);
//		driver.switchTo().alert().accept();
	}

}
