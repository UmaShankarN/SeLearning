package wrappers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ApplicationLogin
{
	//@Test
	//@Test(dependsOnMethods={"wrappers.CreateLead.TestClass"})
	@Test(groups={"smoke"}, dataProvider="fetchdataEdit")
  public void editLead(String fName, String title)
  {
	  	
		clickByLink("Leads");
		clickByLink("Find Leads");
		enterByXpath("(//div[starts-with(@class,'x-form-element')])[19]/input[@type='text']", fName);
		clickByXpath("//button[text()='Find Leads']");
		clickByXpathNoSnap("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		verifyTitle("View Lead | opentaps CRM");
		clickByLink("Edit");
		enterById("updateLeadForm_companyName", "CTS");
		clickByXpath("(//input[@type='submit'])[1]");
		verifyTextById("viewLead_companyName_sp", "CTS");
		
  }
	
@DataProvider(name="fetchdataEdit")
	public  Object[][] getData()
	{
		Object[][] data = new Object[1][1];
		data[0][0]="hari";
		//data[0][1]="View Lead | opentaps CRM";
////		data[1][1]="Shankar";
////		data[1][2]="CTS T";
		return data;
}
}
