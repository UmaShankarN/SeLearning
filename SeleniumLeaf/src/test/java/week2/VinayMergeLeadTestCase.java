package week2;

import org.junit.Test;

public class VinayMergeLeadTestCase extends VinayGenericWrappers
{
	@Test
	public void TestClass() throws InterruptedException
	{
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");		
		
		
		switchToLastWindow();	
		enterByXpath("//input[@name='id']", "15345");//from Lead
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		
		switchToLastWindow();	
		enterByXpath("//input[@name='id']", "15344");//to Lead
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		
		switchToParentWindow();
		clickByLink("Merge");
		
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//input[@name='id']","15339");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		verifyTextByXpath("//div[text()='No records to display']","No records to display");
		
		closeBrowser();
		
		}
		
		
	}


