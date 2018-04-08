package wrappers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends ApplicationLogin 
{
	//@Test(enabled=false)
	@Test(dataProvider = "fetchData")
	public void duplicateLead(String emailID)
	
	{
		
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[contains(.,'Email')]");
		enterByName("emailAddress", emailID);
		clickByXpath("//button[text()='Find Leads']");
		String capturedName= getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
		String firstName=capturedName;
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByLink("Duplicate Lead");
		
		verifyTextById("sectionHeaderTitle_leads", "Duplicate Lead");
		clickByName("submitButton");
		
		verifyTextById("viewLead_firstName_sp",firstName);
	}
//
	@DataProvider(name="fetchData")
	public  Object[][] getData()
	{
		Object[][] data = new Object[1][1];
		data[0][0]="test@gmail.com";
//		//data[1][0]="Uma1";
////		data[1][1]="Shankar";
////		data[1][2]="CTS T";
		return data;
}

}
