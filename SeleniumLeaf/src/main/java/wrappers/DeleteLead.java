package wrappers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteLead extends ApplicationLogin
{
	//@Test(dependsOnMethods={"wrappers.CreateLead.TestClass"})
	@Test(groups={"sanity"},dependsOnGroups="smoke", dataProvider="fetchDataDelete")
	public void deleteLead(String countryCode,String areaCode,String phoneNumber)
	{
	    clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Phone']");
		enterByName("phoneCountryCode", countryCode);
		enterByName("phoneAreaCode", areaCode);
		enterByName("phoneNumber", phoneNumber);
		clickByXpath("//button[text()='Find Leads']");
		String a=getTextByXpath("//div[starts-with(@class, 'x-grid3-cell-inner')]/a[@class='linktext']");
		System.out.println(a);
						
		clickByXpathNoSnap("//div[starts-with(@class, 'x-grid3-cell-inner')]/a[@class='linktext']");
		clickByLink("Delete");
		clickByLink("Find Leads");
		enterByXpath("//input[@name='id']", a);
		clickByXpath("//button[text()='Find Leads']");
		verifyTextByXpath("//div[text()='No records to display']","No records to display");
	}
	
	@DataProvider(name="fetchDataDelete")
	public  Object[][] getData()
	{
		Object[][] data = new Object[1][3];
		data[0][0]="91";
		data[0][1]="044";
		data[0][2]="123456789";
//		data[1][0]="Uma1";
//		data[1][1]="Shankar";
//		data[1][2]="CTS T";
		return data;
}
}
