package wrappers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MergeLeadTestCaseDown extends ApplicationLogin
{
	//@Test(enabled=false)
	//@Test(timeOut=20000)
	@Test(dataProvider="fetchDataMerge")
	//@Test(groups={"sanity"},dependsOnGroups="smoke",dataProvider="fetchDataMerge")
	public void mergeLead(String fLead, String tLead, String lead) throws InterruptedException
	{
		
		
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");		
		
		switchToLastWindow();	
		enterByXpath("//input[@name='id']", fLead);//from Lead
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");

		switchToParentWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		
		switchToLastWindow();	
		enterByXpath("//input[@name='id']", tLead);//to Lead
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		
		switchToParentWindow();
		clickByLinkNoSnap("Merge");
		
		acceptAlert();
		clickByLink("Find Leads");
		enterByXpath("//input[@name='id']",lead);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		
		verifyTextByXpath("//div[text()='No records to display']","No records to display");
		
		
		
		}
		
	@DataProvider(name="fetchDataMerge")
public  Object[][] getData(){
		
		Object[][] data = new Object[1][3];
		
		data[0][0]="10608";
		data[0][1]="10644";
		data[0][2]="10644";
//		data[1][0]="Uma1";
//		data[1][1]="Shankar";
//		data[1][2]="CTS T";
		return data;
		
		
	
}	
	}


